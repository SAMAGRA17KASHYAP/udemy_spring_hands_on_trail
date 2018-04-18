<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student form</title>
<style>
	.error{
		background-color:red;
	}
</style>
</head>
<body>
	<form:form action="processForm.html"  modelAttribute="student">
		First Name<form:input path="firstName"/>
		<br/>
		Last Name<form:input path="lastName"/>
		<form:errors path="lastName"  cssClass="error"/>
		<br/>
		Country
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
		<br/>
		C#<form:radiobutton path="favouriteLanguage" value="C#"/>
		Java<form:radiobutton path="favouriteLanguage" value="Java"/>
		Python<form:radiobutton path="favouriteLanguage" value="Python"/>
		<br/>
		Operating Systems
		<form:checkbox path="operatingSystems" value="Microsoft1"/>
		<form:checkbox path="operatingSystems" value="Microsoft2"/>
		<form:checkbox path="operatingSystems" value="Microsoft3"/>
		<br/>
		<form:input path="age"/>
		<form:errors path="age" cssClass="error"/>
		<br/>
		Postal Code
		<form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"/>
		<br/>
		Course
		<form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"/>
		
		<br/>
		<form:button>Submit</form:button>
	</form:form>
</body>
</html>