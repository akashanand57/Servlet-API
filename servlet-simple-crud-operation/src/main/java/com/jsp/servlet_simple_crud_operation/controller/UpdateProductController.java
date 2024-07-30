package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import com.jsp.servlet_simple_crud_operation.dao.ProductDao;
import com.jsp.servlet_simple_crud_operation.dto.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(value = "/productUpdate")
public class UpdateProductController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ProductDao dao = new ProductDao();
		
		int id = Integer.valueOf(req.getParameter("id"));
		String name = req.getParameter("name");
		double price = Double.valueOf(req.getParameter("price"));
		String mfg = req.getParameter("mfd");
		String expd = req.getParameter("expd");
		
		Product product = new Product(id, name, price, LocalDate.parse(mfg), LocalDate.parse(expd));
		
		dao.updateProductDetailsDao(product);
		
		req.getRequestDispatcher("product-display.jsp").forward(req, resp);
	}
}
