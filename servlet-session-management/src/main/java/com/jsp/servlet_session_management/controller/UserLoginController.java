package com.jsp.servlet_session_management.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet(value = "/loginUser")
public class UserLoginController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession = req.getSession();
		
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(userName.equals("nirmal")&& password.equals("nirmal@123")) {
			
			httpSession.setAttribute("user", userName);
			httpSession.setMaxInactiveInterval(30);
			
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		} else {
			req.setAttribute("msg", "username or password is incorrect");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
