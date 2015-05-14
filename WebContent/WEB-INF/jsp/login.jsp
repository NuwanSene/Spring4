
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Spring Sample - Login Page</title>
</head>
<body>
	
		<h1>Login to Portal</h1>
		
		<br />
		<form:form commandName="login" method="POST" action="successLogin"> 		
			User Name:<form:input path="userName" />
			<font color="red"><form:errors path="userName" /></font>
			<br />
			<br /> Password:<form:password path="password" />
			<font color="red"><form:errors path="password" /></font>
			<br />
			<br />
			<input type="submit" value="Login" />
		</form:form>
	
</body>
</html>
