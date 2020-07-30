package com.transaction.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.batch.demo.Customer;
import com.dbutil.MySqlDbConnection;

public class CustomerTransactionMain {

	public static void main(String[] args) {
		List<Customer> c1 = new ArrayList<>();
		c1.add(new Customer(992, "Sam", "Chennai", "M", 23, 523231110L));
		c1.add(new Customer(993, "Mahesh", "Chennai", "M", 21, 1231231121L));
		c1.add(new Customer(994, "Jerome", "Mumbai", "M", 43, 423231112L));
		c1.add(new Customer(995, "Ramya", "Delhi", "F", 21, 231211123L));

		Connection connection = null;
		try {
			connection = MySqlDbConnection.getConnection();
			connection.setAutoCommit(false);
			String sql = "insert into customer(id,name,city,age,gender,contact) values(?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			for (Customer customer : c1) {
				preparedStatement.setInt(1, customer.getId());
				preparedStatement.setString(2, customer.getName());
				preparedStatement.setString(3, customer.getCity());
				preparedStatement.setInt(4, customer.getAge());
				preparedStatement.setString(5, customer.getGender());
				preparedStatement.setLong(6, customer.getContact());
				preparedStatement.addBatch();
			}
			int c[] = preparedStatement.executeBatch();
			connection.commit();
			System.out.println(c.length + " record/s inserted");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			try {
				System.out.println(e);
				System.out.println("Rolling back");				
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println(e);
			}
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

}
