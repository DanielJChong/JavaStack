<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Results Page</title>
</head>
<body>
	<h1>Submitted Info</h1>
	<h4>Name: <c:out value="${name}"/></h4>
	<h4>Dojo Location: <c:out value="${location}"/></h4>
	<h4>Favorite Language: <c:out value="${language}"/></h4>
	<h4>Comment: <c:out value="${comment}"/></h4>
	<form action="/">
		<button>Go Back</button>
	</form>
</body>
</html>