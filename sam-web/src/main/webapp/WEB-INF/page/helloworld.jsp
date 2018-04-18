<%@page language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Show Form</title>
	</head>
	<body>
		<form action="processForm.html" method="post">
			<input type="text" name="name"/>
			<button>Submit</button> 
		</form>
		<img  src="${pageContext.request.contextPath}/resources/EmpPic.png"/>
		<br/>
		${pageContext.request.contextPath}
	</body>
</html>