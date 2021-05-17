<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Time Page</title>
	<link rel="stylesheet" type="text/css" href="css/time.css">
    <script type="text/javascript" src="js/time.js"></script>
</head>
<body>
	<h1><fmt:formatDate pattern = "h:mm a" value = "${time}" /></h1>
	
</body>
</html>