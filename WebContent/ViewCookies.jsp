<!-- HTML Page that displays the user First & Last Name
     A button to view stored Cookies is provided 
     A button to clear the Cookies is provided
 -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Cookies</title>
</head>
<body bgcolor ="#E6E6E6">  <!-- Grey color -->
<h1 align="center">Setting Cookies Example</h1>
<ul>
<li><b> First Name:</b> ${sessionScope.firstName} </li> <!-- Call First Name -->
<li><b> Last Name:</b>  ${sessionScope.lastName}</li>   <!-- Call Last Name -->
</ul>

<!-- Buttons to call Servlets -->
<form action="ViewCookies" method="GET">
<input type="submit" name="ViewCookies" value="View Cookies"/> <!-- Calls View Cookies Servlet -->
</form>

<form action="DeleteCookies" method="GET">
<input type="submit" name="DeleteCookies" value="Delete Cookies"/> <!-- Calls Delete Cookies Servlet -->
</form>

</body>
</html>