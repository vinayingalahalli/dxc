package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		user.setFname( request.getParameter("fname"));
		user.setLname( request.getParameter("lname"));
		user.setContact(Long.parseLong( request.getParameter("contact")));
		user.setEmail( request.getParameter("email"));
	
		HttpSession session=request.getSession();
		//Use this to create a new session, 
		//if the session is already created and if you want cuurent page to participate in the session
		//the make it request.getSession(false);
		session.setAttribute("user", user);
		
		response.sendRedirect("two.html");
		
	}

}
