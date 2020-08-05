package com.customer.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.customer.exception.BusinessException;
import com.customer.model.Customer;
import com.customer.service.CustomerService;
import com.customer.service.impl.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerSearchController
 */
public class CustomerSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerSearchController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int criteria = Integer.parseInt(request.getParameter("criteria"));
		String value=request.getParameter("value");
		CustomerService service=new CustomerServiceImpl();
		List<Customer> customerList=null;
		switch (criteria) {
		case 1:int id=Integer.parseInt(value);
			try {
				customerList=new ArrayList<>();
				customerList.add(service.getCustomerById(id));
				HttpSession session=request.getSession();
				session.setAttribute("customerList", customerList);
				response.sendRedirect("results.jsp");
			} catch (BusinessException e) {
				request.setAttribute("error", e.getMessage());
				request.getRequestDispatcher("index.jsp").include(request, response);
			}
			break;
		case 2:try {
				customerList=service.getCustomersByGender(value);
				HttpSession session=request.getSession();
				session.setAttribute("customerList", customerList);
				response.sendRedirect("results.jsp");
			} catch (BusinessException e) {
				request.setAttribute("error", e.getMessage());
				request.getRequestDispatcher("index.jsp").include(request, response);
			}

			break;
		case 3:System.out.println("For assignment");

			break;
		case 4:System.out.println("For assignment");

			break;
		case 5:try {
			customerList=service.getAllCustomers();
			HttpSession session=request.getSession();
			session.setAttribute("customerList", customerList);
			response.sendRedirect("results.jsp");
		} catch (BusinessException e) {
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("index.jsp").include(request, response);
		}

			break;

		}
	}

}
