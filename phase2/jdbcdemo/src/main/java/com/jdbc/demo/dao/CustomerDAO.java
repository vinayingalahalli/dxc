package com.jdbc.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbutil.MySqlDbConnection;
import com.jdbc.demo.insert.Customer;

public class CustomerDAO {
	public int addCustomer(Customer customer) {
		int c=0;
		
		try(Connection connection= MySqlDbConnection.getConnection();) {
			String sql="insert into customer(id,name,city,age,gender,contact) values(?,?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, customer.getId());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setString(3, customer.getCity());
			preparedStatement.setInt(4, customer.getAge());
			preparedStatement.setString(5, customer.getGender());
			preparedStatement.setLong(6, customer.getContact());
			
			c=preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		return c;
	}
	
	public Customer getCustomerById(int id) {
		Customer customer=null;
		try(Connection connection= MySqlDbConnection.getConnection();) {
			String sql="select name,city,age,gender,contact from customer where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				customer=new Customer();
				customer.setId(id);
				customer.setAge(resultSet.getInt("age"));
				customer.setName(resultSet.getString("name"));
				customer.setCity(resultSet.getString("city"));
				customer.setGender(resultSet.getString("gender"));
				customer.setContact(resultSet.getLong("contact"));
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return customer;
	}
	public Customer getCustomerByContact(long contact) {
		Customer customer=null;
		try(Connection connection= MySqlDbConnection.getConnection();) {
			String sql="select id,name,city,age,gender from customer where contact=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setLong(1, contact);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				customer=new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setAge(resultSet.getInt("age"));
				customer.setName(resultSet.getString("name"));
				customer.setCity(resultSet.getString("city"));
				customer.setGender(resultSet.getString("gender"));
				customer.setContact(contact);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return customer;
	}
	
	
	public List<Customer> getCustomersByGender(String gender) {
		List<Customer> customerList=new ArrayList<>();
		try(Connection connection= MySqlDbConnection.getConnection();) {
			String sql="select id,name,city,age,contact from customer where gender=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, gender);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Customer customer=new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setAge(resultSet.getInt("age"));
				customer.setName(resultSet.getString("name"));
				customer.setCity(resultSet.getString("city"));
				customer.setGender(gender);
				customer.setContact(resultSet.getLong("contact"));
				customerList.add(customer);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return customerList;
	}
	
	
	
	
	public List<Customer> getCustomersByAgeRange(int lower,int upper) {
		List<Customer> customerList=new ArrayList<>();
		try(Connection connection= MySqlDbConnection.getConnection();) {
			String sql="select id,name,city,gender,contact,age from customer where age between ? and ?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, lower);
			preparedStatement.setInt(2, upper);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Customer customer=new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setAge(resultSet.getInt("age"));
				customer.setName(resultSet.getString("name"));
				customer.setCity(resultSet.getString("city"));
				customer.setGender(resultSet.getString("gender"));
				customer.setContact(resultSet.getLong("contact"));
				customerList.add(customer);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return customerList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
