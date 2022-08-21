<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Page</title>
</head>
<body>
	Student Confirmed is : ${student.firstName} ${student.lastName} 
	<br>
	Country : ${student.country}
	<br>
	Programming Language : ${student.programmingLanguage}
	<br>
	Oprating Systems:
	<ul>
		<c:forEach var="os" items='${student.operatingSystems}'>
			<li>${os}</li>
		</c:forEach> 
	</ul>
</body>
</html>