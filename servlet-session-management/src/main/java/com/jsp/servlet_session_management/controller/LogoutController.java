package com.jsp.servlet_session_management.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet(value="/logout")
public class LogoutController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	HttpSession httpSession = req.getSession();	
	
	if(httpSession.getAttribute("user")!=null) {
		httpSession.invalidate();
		req.setAttribute("msg", "Logout Successfully");
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
}
}
