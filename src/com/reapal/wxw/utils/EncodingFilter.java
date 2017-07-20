package com.reapal.wxw.utils;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class EncodingFilter implements Filter {
	private String charset;

	public EncodingFilter() {
		super();
	}

	public void destroy() {
		
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding(this.charset);
		
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		
		this.charset=filterConfig.getInitParameter("enc");
	}

}
