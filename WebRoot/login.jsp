<%@page language="java" contentType="text/html" pageEncoding="GBK"%>
<%@page import="java.util.*"%>
<html>
	<head>
		<title>Hello World!!!!</title>
		
	</head>
	<script language="javaScript">
				function validate(f){
				if(!(/^\w{5,15}$/.test(f.userid.value))){
					alert("用户ID必须是5~15位！");
					f.userid.focus();
					return false;
}
				if(!(/^\w{5,15}$/.test(f.userpass.value))){
					alert("用户密码必须是5~15位");
					f.userpass.focus();
					return false;

}
					return true;
}
			
			
			</script>

	<body>
			
		<h2>用户登录程序</h2>
		<%
			request.setCharacterEncoding("GBK");
		
		 %>
		 <%
		 	List<String>info=(List<String>)request.getAttribute("info");
		 	if(info!=null){
		 		Iterator<String>iter=info.iterator();
		 	while(iter.hasNext()){
		 	%>
		 	<h3><%=iter.next() %></h3>
		 	<% 
		 	}
		 	}
		 
		  %>
		  <form action="LoginServlet" method="post" onSubmit="return validate(this)">
		  	用户ID：<input type="text" name="userid"><br>
		  	密码：<input type="password" name="userpass"><br>
		  	<input type="submit" value="提交" >
		  	<input type="reset" value="重置" >
		  	
		  
		  </form>
	</body>

</html>