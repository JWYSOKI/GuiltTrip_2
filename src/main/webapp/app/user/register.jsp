<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="/app/partials/header.jsp" />
<title>Register</title>
</head>
<body>
	<div class="wrapper">
		<div class="header">
			<h2>Create Profile</h2>
		</div>
	</div>
	<div class="container" ng-app="app" ng-controller="UserController as controller">
		<form id="userRegistrationForm" name="userRegistrationForm">
			<table>
				<tr>
					<td>Create username</td>
					<td><input ng-model="controller.user.username" id="newUsername" type="text" name="username" required  /></td>
				</tr>
				<tr>
					<td>Create password</td>
					<td><input ng-model="controller.user.password" id="newPassword" type="password" name="password" required/></td>
				</tr>
			</table>
			<button ng-click="controller.addUser()" id="registerNewUser-btn">register</button>
		</form>
	</div>
	<jsp:include page="/app/partials/footer.jsp" />
</body>
</html>
