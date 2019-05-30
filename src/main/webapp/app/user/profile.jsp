
<html>
<head>
<jsp:include page="/app/partials/header.jsp" />
<title>Profile</title>
</head>

<body ng-app="app">

	<div ng-controller="ProfileController as controller">
	<h2>Your Profile</h2>
		<form name="userProfile">

<table>
				<tr>
				<td><input type="hidden" ng-model="controller.user.id" /></td>
				</tr>
				<tr>
					<td>Your username:</td>
					<!-- this displays strings and connects to the value on the controller -->
					<span>{{controller.user.username}}</span>
					<td>
						<input type="text" ng-model="controller.user.username" id="username" name="username" />
						<button ng-click="controller.updateUsername()">edit</button>
					</td>
						
				</tr>
				<tr>
					<td>Your password:</td>
					<td><input ng-model="controller.user.password" type="password" name="password" />
					<button ng-click="controller.updatePassword()">edit</button></td>
						
				</tr>
			</table>
			<button ng-click="controller.deleteUser()">delete account</button>
		</form>		

	
</div>
<jsp:include page="/app/partials/footer.jsp" />
</body>
</html>	
	
	
	