package com.jdbc.demo.getcustomer;

import java.util.List;

import com.jdbc.demo.dao.CustomerDAO;
import com.jdbc.demo.insert.Customer;

public class GetCustomer {

	public static void main(String[] args) {
		CustomerDAO dao=new CustomerDAO();
		Customer customer=dao.getCustomerById(100);
		if(customer!=null) {
			System.out.println("Customer found with below details ");
			System.out.println(customer);
		}else {
			System.out.println("Customer Not found");
		}
		
		customer=dao.getCustomerByContact(1234567890);
		
		if(customer!=null) {
			System.out.println("Customer with contact found with below details ");
			System.out.println(customer);
		}else {
			System.out.println("Customer Not found with that contact");
		}
		
		List<Customer> customerList=dao.getCustomersByGender("F");
		if(customerList!=null && customerList.size()>0 ) {
			System.out.println("Customers found with gender");
			for(Customer c:customerList) {
				System.out.println(c);
			}
		}else {
			System.out.println("No customer found with that gender");
		}
		
		
		
		System.out.println("\n\nFinding customers by age range");
		List<Customer> customerList2=dao.getCustomersByAgeRange(1	, 2);
		if(customerList2!=null && customerList2.size()>0 ) {
			System.out.println("Customers found with age range");
			for(Customer c:customerList2) {
				System.out.println(c);
			}
		}else {
			System.out.println("No customer found with that age range");
		}
		
	}

}
