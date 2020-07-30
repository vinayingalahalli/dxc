package com.batch.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbutil.MySqlDbConnection;

public class CustomerBatchMain {

	public static void main(String[] args) {

		List<Customer> c1 = new ArrayList<>();
		c1.add(new Customer(988, "Sam", "Chennai", "M", 23, 1231231118L));
		c1.add(new Customer(989, "Mahesh", "Chennai", "M", 21, 1231231117L));
		c1.add(new Customer(990, "Jerome", "Mumbai", "M", 43, 1231231116L));
		c1.add(new Customer(991, "Ramya", "Delhi", "F", 21, 1231231115L));

		try (Connection connection = MySqlDbConnection.getConnection();) {
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
			int c[]=preparedStatement.executeBatch();
			System.out.println(c.length+" record/s inserted");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		

	}

}
