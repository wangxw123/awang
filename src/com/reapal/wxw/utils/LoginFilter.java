package com.reapal.wxw.utils;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter{

	/**
	 * Constructor of the object.
	 */
	public LoginFilter() {
		super();
	}

	public void destroy() {
		
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpSession se=req.getSession();
		if (se.getAttribute("userid")!=null) {
			chain.doFilter(request, response);
			
		}else{
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
		
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}

}
