<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>Product-Reistration-Form</h5>
	<div>
		<form action="productRegister">
			<label>ProductId:</label><br>
			<input type="number" placeholder="enter productId" name="id" ><br>
			<label>ProductName:</label><br>
			<input type="text" placeholder="enter product Name" name="name" ><br>
			<label>ProductPrice:</label><br>
			<input type="number" placeholder="enter product Price" name="price" ><br>
			<label>ProductMfd:</label><br>
			<input type="date" name="mfd" ><br>
			<label>ProductExpd:</label><br>
			<input type="date" name="expd" ><br>
			
			<input type="submit" value="registered">
			</form>
	</div>
</body>
</html>