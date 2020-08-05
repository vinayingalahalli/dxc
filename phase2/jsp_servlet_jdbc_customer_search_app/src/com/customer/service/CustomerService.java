package com.customer.service;

import java.util.List;

import com.customer.exception.BusinessException;
import com.customer.model.Customer;

public interface CustomerService {

	public Customer getCustomerById(int id) throws BusinessException;
	public List<Customer> getAllCustomers() throws BusinessException;
	public List<Customer> getCustomersByGender(String gender) throws BusinessException;
	public List<Customer> getCustomersByCity(String city)throws BusinessException;
	public Customer getCustomerByContactNumber(long contact) throws BusinessException;
}
