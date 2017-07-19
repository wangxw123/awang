<%@page language="java" contentType="text/html" pageEncoding="GBK"%>
<html>
	<head>
		<title>Hello World!!!!!</title>
	</head>
	<body>
		<h2>获取session的属性<%=session.getAttribute("username") %></h2>
		<h2>获取session的属性<%=request.getAttribute("hello") %></h2>
	
	</body>
	
</html>