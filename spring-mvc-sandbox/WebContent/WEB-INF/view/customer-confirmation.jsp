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
<title>Customer Confirmation</title>
</head>

<body>
	<!-- @ModelAttribute("customer") ${object.methodName} Spring will call ${customer.getFirstName()} -->
	<h3>The customer is confirmed: ${customer.firstName}
		${customer.lastName}</h3>
	<h3>Free passes: ${customer.freePasses}</h3>
	<h3>Postal code: ${customer.postalCode}</h3>
	<h3>Course code: ${customer.courseCode}</h3>
</body>

</html>