<%@page import="com.jsp.servlet_simple_crud_operation.dto.Product"%>
<%@page import="com.jsp.servlet_simple_crud_operation.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		int id=Integer.parseInt(request.getParameter("id"));
		Product product = new ProductDao().getProductByIdDao(id);
	%>

	<h5>Product-Update-Form</h5>
	<div>
		<form action="productUpdate">
			<label>ProductId:</label><br>
			<input type="number" name="id" value=<%=product.getId() %>><br>
			<label>ProductName:</label><br>
			<input type="text"  name="name" value=<%=product.getName() %>><br>
			<label>ProductPrice:</label><br>
			<input type="number" name="price" value=<%=product.getPrice() %>><br>
			<label>ProductMfd:</label><br>
			<input type="date" name="mfd" value=<%=product.getMfd() %>><br>
			<label>ProductExpd:</label><br>
			<input type="date" name="expd" value=<%=product.getExpd() %>><br>
			
			<input type="submit" value="update">
			</form>
	</div>
</body>
</html>