<!-- HTML Page that calls TackCookies Servlet 
     Displays a Form to enter the First and Last Name
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="TrackCookies" method="POST"> <!-- Calls TrackCookies Servlet -->
	First Name:
	<input type="text" name="firstName"/> <br><!-- Prompts user to enter First Name -->
	Last Name:
	<input type="text" name="lastName"/> <!-- Prompts user to enter Last name -->
	<input type="Submit"/> <!-- Send form and calls Servlet -->
	</form>

</body>
</html>