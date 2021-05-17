<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Main Page</title>
</head>
<body>
	<p><c:out value="${error}"></c:out></p>
	<form method="POST" action="/">
    <label>What is the code? <input type="text" name="code"></label>
    <button>Try Code</button>
</form>
</body>
</html>