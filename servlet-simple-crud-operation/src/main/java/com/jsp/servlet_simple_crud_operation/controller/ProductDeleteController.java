package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;

import com.jsp.servlet_simple_crud_operation.dao.ProductDao;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ProductDeleteController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		new ProductDao().deleteProductByIdDao(id);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("product-display.jsp");
		dispatcher.forward(req, res);
		
	}
	
}
