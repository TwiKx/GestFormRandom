<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="service.RandomInRange" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestform Random</title>

</head>
<body>
	<form method="post" action="random" name="random" id="random">
		<p>Donnez moi la taille de liste que vous souhaitez :</p>
		<input type="text" name="listSize" id="inputSize"></input>
		<input type="submit" value="valider" id="validate"></input>
	</form>
	<c:forEach items="${ listOfRandom }" var="value">
		<p><c:out value="${ value }"/></p>
	</c:forEach>
</body>
</html>
