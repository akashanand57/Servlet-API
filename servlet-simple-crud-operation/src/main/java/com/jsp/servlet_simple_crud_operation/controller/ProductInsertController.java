package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import com.jsp.servlet_simple_crud_operation.dao.ProductDao;
import com.jsp.servlet_simple_crud_operation.dto.Product;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ProductInsertController implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ProductDao dao = new ProductDao();
		PrintWriter printWrite = res.getWriter();
		
		int id = Integer.valueOf(req.getParameter("id"));
		String name = req.getParameter("name");
		double price = Double.valueOf(req.getParameter("price"));
		String mfg = req.getParameter("mfd");
		String expd = req.getParameter("expd");
		
		System.out.println("The Product Registration Details ------");
		System.out.println("The Product id is :- "+id);
		System.out.println("The Product name is :- "+name);
		System.out.println("The Product Price is :- "+price);
		System.out.println("The Product Manufacturing Date is :- "+mfg);
		System.out.println("The Product Expire Date is :- "+expd);
		
		printWrite.println("<html><body>");
		printWrite.println("<h1>The Product Registration Details </h1>");
		printWrite.println("<p> The Product Id is :- "+id+"</p>");
		printWrite.println("<p> The Product Name is :- "+name+"</p>");
		printWrite.println("<p> The Product Price is :- "+price+"</p>");
		printWrite.println("<p> The Product Manufacturing Date is :- "+mfg+"</p>");
		printWrite.println("<p> The Product Expire Date is :- "+expd+"</p>");
		printWrite.println("</body></html>");
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("product-register.jsp");
		requestDispatcher.include(req, res);
//		requestDispatcher.forward(req, res);
		
		Product product = new Product(id, name, price, LocalDate.parse(mfg), LocalDate.parse(expd));
		dao.saveProductDao(product);
	}

	

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	

}
