package com.jsp.servlet_simple_crud_operation.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Product implements Serializable {
	
	private int id;
	private String name;
	private double price;
	private LocalDate mfd;
	private LocalDate expd;
	
	public Product() {
		super();
	}
	
	public Product(int id, String name, double price, LocalDate mfd, LocalDate expd) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.mfd = mfd;
		this.expd = expd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getMfd() {
		return mfd;
	}

	public void setMfd(LocalDate mfd) {
		this.mfd = mfd;
	}

	public LocalDate getExpd() {
		return expd;
	}

	public void setExpd(LocalDate expd) {
		this.expd = expd;
	}
}
