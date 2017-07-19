<%@page language="java" contentType="text/html" pageEncoding="GBK"%>
<html>

	<head>
		<title>Hello world!!!</title>
	</head>
	<body>
		<h1>取得session的属性<%=session.getAttribute("username") %></h1>
		<h1>取得request的属性<%=request.getAttribute("hello") %></h1>
	
	
	</body>
</html>