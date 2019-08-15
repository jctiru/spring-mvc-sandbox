<%@ page
	language="java"
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib
	prefix="form"
	uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>

<body>

	<form:form
		action="process-form"
		modelAttribute="student">
		<h3>
			First name:
			<form:input path="firstName" />
		</h3>
		<h3>
			Last name:
			<form:input path="lastName" />
		</h3>
		<br>
		<h3>
			Country:
			<form:select path="country">
				<%-- <form:option
				value="Philippines"
				label="Philippines" /> --%>
				<!-- Spring will call student.getCountryOptions() -->
				<%-- <form:options items="${student.countryOptions}" /> --%>
				<!-- Get countries from property file from controller -->
				<form:options items="${countryOptions}" />
			</form:select>
		</h3>
		<br>
		<h3>Favorite Programming Language:</h3>
		<p>
			Java
			<form:radiobutton
				path="favoriteLanguage"
				value="Java" />
			Ruby
			<form:radiobutton
				path="favoriteLanguage"
				value="Ruby" />
			Python
			<form:radiobutton
				path="favoriteLanguage"
				value="Python" />
			Javascript
			<form:radiobutton
				path="favoriteLanguage"
				value="Javascript" />
			PHP
			<form:radiobutton
				path="favoriteLanguage"
				value="PHP" />
		</p>
		<br>
		<br>
		<h3>
			Operating Systems: Linux
			<form:checkbox
				path="operatingSystems"
				value="Linux" />
			Windows
			<form:checkbox
				path="operatingSystems"
				value="Windows" />
			Mac OS
			<form:checkbox
				path="operatingSystems"
				value="Mac OS" />
		</h3>
		<input
			type="submit"
			value="Submit" />
	</form:form>

</body>

</html>