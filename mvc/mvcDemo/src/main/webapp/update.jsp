<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=ISO-8859-1"%>

<html>
<head>
<title>demo</title>
</head>
<body>

	<h2>Enter Details</h2>
<h2>
<form action="save" method="post">
<table>
<tr>
<td>Enter ID:</td><td><input type="number" name="id" value="${id}" disabled></td>
</tr>
<tr>
<td>Enter Name:</td><td><input type="text" name="name"></td></tr>
<tr>
<td>Enter Designation:</td><td><input type="text" name="design"></td>
</tr>
<tr>
<td>
<input type="submit" value="save"></td>
</tr>
</table>
</h2>
	
</body>
</html>