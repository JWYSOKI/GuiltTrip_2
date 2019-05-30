<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<jsp:include page="/app/partials/header.jsp" />
<title>Welcome</title>
</head>

<body ng-app="app">

	<div ng-controller="TaskController as controller">
		<h2>Welcome to Guilt Trip!</h2>
		<form name="myAsynchronosForm" ng-submit="controller.submit()">
			<table>
				<tr>
					<td><input type="hidden" ng-model="controller.task.id" /></td>
				</tr>
				<tr>
					<td>Enter activity</td>
					<td><input type="text" ng-model="controller.task.activity"
						id="activity" name="activity" required /></td>
				</tr>
				<tr>
					<td>Enter motivation (optional)</td>
					<td><input type="text" ng-model="controller.task.motivation"
						id="motivation" /></td>
				</tr>
				<tr>
					<td>Enter reminder time</td>
					<td><input type="text" ng-model="controller.task.reminderTime"
						id="reminderTime" required /></td>
				</tr>
				<tr>
					<td><input id="submit-btn" type="submit"></td>
				</tr>
			</table>
			<br /> <br />

		</form>
		
		<div ng-if = "controller.task.showMessage">
							alert: you have created a new task
							 </div> 
		<table>
			<thead>
				<tr>
					<th>ID |</th>
					<th>ACTIVITY |</th>
					<th>MOTIVATION |</th>
					<th>REMINDER_TIME</th>
					<th width="20%"></th>
				</tr>
			<thead>
			<tbody>
				<tr ng-repeat="guilt in controller.tasks" >
					<td><span ng-bind="guilt.id"></span></td>
					<td><span ng-bind="guilt.activity"></span></td>
					<td><span ng-bind="guilt.motivation" id="task-{{guilt.motivation}}"></span></td>
					<td><span ng-bind="guilt.reminderTime"></span></td>
					<td>
						<button type="button" ng-click="controller.edit(guilt.id)"
							class="btn edit">edit</button>
						<button type="button" ng-click="controller.remove(guilt.id)"
							class="btn remove">delete</button>
							
							
				</tr>
			</tbody>
		</table>
	</div>
	<jsp:include page="/app/partials/footer.jsp" />
</body>
</html>