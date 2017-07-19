<%@page language="java" contentType="text/html" pageEncoding="GBK"%>
<html>

	<head>
		<title>Hello World!!~~</title>
	
	</head>
	<body>
		<%
			String path=this.getServletContext().getRealPath("/");
		
		
		 %>
		<h1><%=path %></h1>	
	
	</body>
</html>