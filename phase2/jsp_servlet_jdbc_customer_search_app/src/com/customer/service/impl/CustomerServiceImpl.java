package com.customer.service.impl;

import java.util.List;

import com.customer.dao.CustomerDAO;
import com.customer.dao.impl.CustomerDAOImpl;
import com.customer.exception.BusinessException;
import com.customer.model.Customer;
import com.customer.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO dao=new CustomerDAOImpl();
	@Override
	public Customer getCustomerById(int id) throws BusinessException {
		Customer customer = null;
		if (id > 99 && id < 1000) {
			// code here for DAO
			customer=dao.getCustomerById(id);
		} else {
			throw new BusinessException("Entered id " + id + " is invalid");
		}
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws BusinessException {
		List<Customer> customerList = null;
//here for DAO
		customerList=dao.getAllCustomers();
		return customerList;
	}

	@Override
	public List<Customer> getCustomersByGender(String gender) throws BusinessException {
		List<Customer> customerList = null;
		if (gender.matches("[mMfF]{1}")) {
			// here for DAO
			customerList=dao.getCustomersByGender(gender);
		} else {
			throw new BusinessException("Entered Gender " + gender + " is invalid");
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
