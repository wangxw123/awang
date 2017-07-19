package com.reapal.wxw.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reapal.wxw.factory.DAOFactory;
import com.reapal.wxw.vo.User;

public class LoginServlet extends HttpServlet {

	
	public LoginServlet() {
		super();
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String path="login.jsp";
		String userid=request.getParameter("userid");
		String password=request.getParameter("userpass");
		List<String>info=new ArrayList<String>();
		if (userid==null||"".equals(userid)) {
			info.add("�û�id����Ϊ��");
		}
		if (password==null||"".equals(password)) {
			info.add("�û����벻��Ϊ��");
		}
		if (info.size()==0) {
			User user=new User();
			user.setUserid(userid);
			user.setPassword(password);
			try {
				if (DAOFactory.getIUserDAO().findLogin(user)) {
					info.add("�û���¼�ɹ�����ӭ"+user.getName()+"����");
				}else{
					info.add("�������Ϣ");
					
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
			request.setAttribute("info", info);
			request.getRequestDispatcher(path).forward(request, response);
			
		}
		
		



	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
			
		
	}

}
