<%@page language="java" contentType="text/html" pageEncoding="GBK"%>
<%@page import="java.util.*"%>
<html>
	<head>
		<title>Hello World!!!!</title>
		
	</head>
	<script language="javaScript">
				function validate(f){
				if(!(/^\w{5,15}$/.test(f.userid.value))){
					alert("�û�ID������5~15λ��");
					f.userid.focus();
					return false;
}
				if(!(/^\w{5,15}$/.test(f.userpass.value))){
					alert("�û����������5~15λ");
					f.userpass.focus();
					return false;

}
					return true;
}
			
			
			</script>

	<body>
			
		<h2>�û���¼����</h2>
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
		  	�û�ID��<input type="text" name="userid"><br>
		  	���룺<input type="password" name="userpass"><br>
		  	<input type="submit" value="�ύ" >
		  	<input type="reset" value="����" >
		  	
		  
		  </form>
	</body>

</html>