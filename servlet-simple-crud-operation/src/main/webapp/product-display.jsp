<%@page import="java.util.List"%>
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
		ProductDao dao=new ProductDao();
		List<Product> products=dao.displayAllProductDao();
	%>
		


	<table border="2">
		<tr style="color: purple;">
			<th>ProductId:</th>
			<th>ProdutName:</th>
			<th>ProductPrice:</th>
			<th>ProductMfd:</th>
			<th>ProductExpd:</th>
			<th colspan="2">Action:</th>
		</tr>
		<%for(Product product:products) {%>
		<tr style="color: red;">
			<td><%=product.getId() %></td>
			<td><%=product.getName() %></td>
			<td><%=product.getPrice() %></td>
			<td><%=product.getMfd() %></td>
			<td><%=product.getExpd() %></td>
			<td><a href="delete?id=<%=product.getId() %>"><button style="background-color: red">DELETE</button></a></td>
			<td><a href="product-update.jsp?id=<%=product.getId() %>"><button style="background-color: yellow">UPDATE</button></a></td>
		</tr>
		<%} %>
	</table>
</body>
</html>