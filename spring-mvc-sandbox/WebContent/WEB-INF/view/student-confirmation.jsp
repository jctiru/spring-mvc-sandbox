<%@ page
	language="java"
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib
	prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>

<body>
	<!-- ${object.methodName} Spring will call ${student.getFirstName()} -->
	<h2>The student is confirmed: ${student.firstName}
		${student.lastName}</h2>
	<h2>Country: ${student.country}</h2>
	<h2>Favorite programming language: ${student.favoriteLanguage}</h2>
	<h2>Operating Systems:</h2>
	<ul>
		<c:forEach
			var="temp"
			items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
</body>

</html>