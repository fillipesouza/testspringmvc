<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${title}</h1>
	<h2>${msg}</h2>
	
	<p>${student1.name} </p>
	<p>${student1.origin} </p>
	<p>${student1.mobile} </p>
	<p>${student1.dob} </p>
	<p>${student1.skills} </p>
	
	<p>Student Address</p>
	<p>${student1.studentAddress.country} </p>
	<p>${student1.studentAddress.city} </p>
	<p>${student1.studentAddress.street} </p>
	<p>${student1.studentAddress.pinCode} </p>
	

</body>
</html>