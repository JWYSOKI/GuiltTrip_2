<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<jsp:include page="/app/partials/header.jsp" />
<title>Login</title>
</head>

<body ng-app="app">

	<div ng-controller="UserController as controller">
	<h2>Login</h2>
		<form name="userRegistrationForm">
			<table>
				<tr>
				<td><input type="hidden" ng-model="controller.user.id" /></td>
				</tr>
				<tr>
					<td>Enter username</td>
					<td><input type="text" ng-model="controller.user.username" id="username" name="username" required />
						
				</tr>
				<tr>
					<td>Enter password</td>
					<td><input ng-model="controller.user.password" type="password" id="password" name="password" required/>
						
				</tr>
			</table>
			<button ng-click="controller.loginUser()" id="loggedIn-btn">login</button>
		</form>		
	</div>
	<jsp:include page="/app/partials/footer.jsp" />
</body>
</html>
