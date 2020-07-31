package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h2><u>Accessing ServletConfig params of Servlet1 in Servlet1</u><h2>");

		ServletConfig config = getServletConfig();

		out.print("<h3>query1 = " + config.getInitParameter("query1") + "</h3>");
		out.print("<h3>query2 = " + config.getInitParameter("query2") + "</h3>");
		out.print("<h3>path = " + config.getInitParameter("path") + "</h3>");

		out.print("<br/<br/><h2><u>Accessing ServletContext params in Servlet1</u><h2>");

		ServletContext context = getServletContext();

		out.print("<h3>driver = " + context.getInitParameter("driver") + "</h3>");
		out.print("<h3>url = " + context.getInitParameter("url") + "</h3>");
		out.print("<h3>username = " + context.getInitParameter("username") + "</h3>");
		out.print("<h3>password = " + context.getInitParameter("password") + "</h3>");
	}

}
