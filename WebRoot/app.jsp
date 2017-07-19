<%@page language="java" contentType="text/html" pageEncoding="GBK" %>
<html>

	<head>
		<title>Hello World!~!</title>
	</head>
	<body>
		<%
			this.getServletContext().setAttribute("info","Hello World!");
			this.getServletContext().setAttribute("wxw","nihao");
		 %>
		 <%
		 
		 	this.getServletContext().removeAttribute("wxw");
		 
		  %>
	
	</body>
</html>
