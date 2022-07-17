<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Page</title>

<style >
	.error {
		color :red
		}
</style>

</head>
<body>
		<h3>User Registration Form</h3>
		<form:form action ="register" modelAttribute="user" method="POST">
		<table>
			<tr>
				<td>UserName:</td>
				<td>
					<form:input path ="userName"/>
					<form:errors path="userName" cssClass="error"/>
				
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td>
					<form:input path ="password"/>
					<form:errors path="password" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td>Email:</td>
				<td>
				<form:input path ="email"/>
				<form:errors path="email" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td>
				<form:input path ="phoneNumber"/>
				<form:errors path="phoneNumber" cssClass="error"/>
				</td>
			</tr>
			<tr>
				<td>Age:</td>
				<td>
				<form:input path ="age"/>
				<form:errors path="age" cssClass="error"/>
				</td>
			</tr>
			
			<tr>
				<td><input type = "submit" value="Register"/></td>
			</tr>
		
		</table>
		</form:form>

</body>
</html>