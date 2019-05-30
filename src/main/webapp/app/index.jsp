<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>GuiltTrip Home</title>
<jsp:include page="/app/partials/header.jsp" />

</head>
<body>
	<div>
		<h1>GuiltTrip</h1>
		<h3><a href="/GuiltTrip_2/register" id="register-btn">Click here to Register</a> </h3>
		<h3><a href="/GuiltTrip_2/login" id="login-btn">Click here to Login </a></h3>	
	</div>
	<jsp:include page="/app/partials/footer.jsp" />
</body>
</html>