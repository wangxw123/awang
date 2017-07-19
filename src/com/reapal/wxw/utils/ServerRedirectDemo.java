package com.reapal.wxw.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServerRedirectDemo extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ServerRedirectDemo() {
		super();
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getSession().setAttribute("username", "wangxingwang");
		request.setAttribute("hello", "world");
		RequestDispatcher rd=request.getRequestDispatcher("get.jsp");
		rd.forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

this.doGet(request, response);

	}

}
