<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Survey Page</title>
</head>
<body>
	<form method="POST" action="/">
    <label>Your Name: <input type="text" name="name"></label>
    <label for="location">Dojo Location: </label>
    <select name="location">
	    <option value="sanjose">San Jose</option>
	    <option value="orangecounty">Orange County</option>
	    <option value="washington">Washington</option>
	</select>
	<label for="password">Favorite Language: </label>
	<select name="language">
	    <option value="java">Java</option>
	    <option value="python">Python</option>
	    <option value="mern">Mern</option>
	</select>
	<label>Comment (optional): </label>
	<textarea name="comment"></textarea>
    <button>Button</button>
</form>
</body>
</html>