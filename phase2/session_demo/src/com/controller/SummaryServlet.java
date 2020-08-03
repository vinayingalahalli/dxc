package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

/**
 * Servlet implementation class SummaryServlet
 */
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SummaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session = request.getSession(false);
		if (session == null) {
			out.print("You should access the page from first only");
		} else {

			User user = (User) session.getAttribute("user");
			user.setPreviousOrganization(request.getParameter("prevorg"));
			user.setYearsofexp(Integer.parseInt(request.getParameter("yoe")));
			user.setDesignation(request.getParameter("designation"));
			
			out.print("<h3>Hello "+user.getFname()+" Your data is as below </h3>");
			out.print("<h3>"+user+"</h3>");
			out.print("<h3>session id = "+session.getId()+"</h3>");
			out.print("<h3>session was created at "+new Date(session.getCreationTime())+"</h3>");
			
		//	session.setMaxInactiveInterval(interval);
			session.invalidate(); /// will destroy the session
		}

	}

}
