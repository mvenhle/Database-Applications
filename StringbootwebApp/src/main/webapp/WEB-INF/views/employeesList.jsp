<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    				
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mvenhle Company Database</title>
</head>
<body>
	<h1>Employees List<h1>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Gender</th>
			<th>Department</th>
			<th>Date of Birth</th>
			<th>Actions</th>
		</tr>
		<c:forEach items="${list}" var="e">
		<tr>
		<td>${e.name}</td>
		<td>${e.gender}</td>
		<td>${e.department}</td>
		<td>${e.dob}</td>
		<td><a href = "delete/${e.id}"> Delete Employee</a></td>
		</tr>
		</c:forEach>
	</table>
	<button onclick="window.location.href = '${pagecontext.request.contextPath}/showEmployeeForm'" >Add Employee</button>
</body>
</html>