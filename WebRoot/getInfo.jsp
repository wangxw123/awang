<%@page language="java" contentType="text/html" pageEncoding="GBK"%>
<html>
	<head>
		<title>Hello World!!!!!</title>
	</head>
	<body>
		<h2>��ȡsession������<%=session.getAttribute("username") %></h2>
		<h2>��ȡsession������<%=request.getAttribute("hello") %></h2>
	
	</body>
	
</html>