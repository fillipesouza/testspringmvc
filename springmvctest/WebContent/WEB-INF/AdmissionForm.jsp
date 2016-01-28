<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${title}</h1>

<form:errors path="student1.*" />

 <form action="/springmvctest/submissionForm.html" method="post">
  Student name: <input type="text" name="name"><br>
  Student origin: <input type="text" name="origin"><br>
  Student mobile: <input type="text" name="mobile"><br>
  Student dob: <input type="text" name="dob"><br>
  Student skills: <select name="skills" multiple>
  					<option name="Java"> Java Core </option>
  					<option name="Spring MVC"> Spring MVC </option>
  					<option name="Spring Core"> Spring Core </option>
  				  </select><br>
  <table>
  	<tr><td> Student Country </td><td><input type="text" name="studentAddress.country"></td></tr>
  	<tr><td> Student City </td><td><input type="text" name="studentAddress.city"></td></tr>
  	<tr><td> Student Street </td><td><input type="text" name="studentAddress.street"></td></tr>
  	<tr><td> Student Pincode </td><td><input type="text" name="studentAddress.pinCode"></td></tr>
  </table>
  
  
  <input type="submit" value="Submit">
  
</form> 

</body>
</html>