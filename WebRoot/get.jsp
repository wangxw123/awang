<%@page language="java" contentType="text/html" pageEncoding="GBK"%>
<html>

	<head>
		<title>Hello world!!!</title>
	</head>
	<body>
		<h1>ȡ��session������<%=session.getAttribute("username") %></h1>
		<h1>ȡ��request������<%=request.getAttribute("hello") %></h1>
	
	
	</body>
</html>