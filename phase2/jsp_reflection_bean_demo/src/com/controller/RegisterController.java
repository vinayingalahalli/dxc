package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	//using request scope
//	User user=(User) request.getAttribute("user");
//	out.print("<h2>Hello "+user.getFname()+" Your details is</h2>");
//	out.print("<h3>"+user+"</h3>");
	
	//using session scope
	HttpSession session=request.getSession(false);
	User user=(User) session.getAttribute("user");
	out.print("<h2>Hello "+user.getFname()+" Your details is</h2>");
	out.print("<h3>"+user+"</h3>");
	}

}
