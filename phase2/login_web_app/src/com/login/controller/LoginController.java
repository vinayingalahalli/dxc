package com.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.exception.BusinessException;
import com.login.model.User;
import com.login.service.LoginService;
import com.login.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		User user=new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));

		LoginService service=new LoginServiceImpl();
		RequestDispatcher rd=null;
		PrintWriter out=response.getWriter();
		try {
			if(service.isValidUserCredentials(user)) {
				//valid user
			//	rd=request.getRequestDispatcher("success");
			//	rd.forward(request, response);
				HttpSession session=request.getSession();
				session.setAttribute("username", user.getUsername());
				//response.sendRedirect("success");
				response.sendRedirect("success.jsp");
			}
		} catch (BusinessException e) {
			//failure or invalid creds
//			rd=request.getRequestDispatcher("login.html");
//			rd.include(request, response);
//			out.print("<center><span style='color:red;'>"+e.getMessage()+"</center>");

			request.setAttribute("error", e.getMessage());
			rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
			
		}
		
	}

}
