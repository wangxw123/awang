<%@page language="java" contentType="text/html" pageEncoding="GBK"%>
<%@page import="com.reapal.wxw.utils.*" %>
<html>
	<head>
		<title>Hello World!@!@</title>
	
	
	</head>
	<body>
		<%
		
		LoginUser ls=new LoginUser("mldn");
		session.setAttribute("info",ls);
		
		 %>
	<%
		session.removeAttribute("info");
	
	 %>
	
	</body>

</html>