package com.customer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.customer.dao.CustomerDAO;
import com.customer.exception.BusinessException;
import com.customer.model.Customer;
import com.dbutil.MySqlDbConnection;

public class CustomerDAOImpl implements CustomerDAO{

	@Override
	public Customer getCustomerById(int id) throws BusinessException {
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
			}else {
				throw new BusinessException("Entered customer id "+id+" not found with any customer details");
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured.. Kindly Contact SYSADMIN");
		}
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws BusinessException {
		List<Customer> customerList=new ArrayList<>();
		try(Connection connection= MySqlDbConnection.getConnection();) {
			String sql="select id,name,city,age,contact,gender from customer";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
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
			if(customerList.size()==0) {
				throw new BusinessException("No customers exist in the DB as of now");
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured.. Kindly Contact SYSADMIN");
		}
		return customerList;
	}

	@Override
	public List<Customer> getCustomersByGender(String gender) throws BusinessException {
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
			if(customerList.size()==0) {
				throw new BusinessException("No customers found with gender "+gender);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured.. Kindly Contact SYSADMIN");
		}
		return customerList;
	}

	@Override
	public List<Customer> getCustomersByCity(String city) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByContactNumber(long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
