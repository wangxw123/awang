package com.reapal.wxw.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SimpleFilter1 implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("销毁");
		
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		System.out.println("执行doFilter方法前");
		arg2.doFilter(arg0, arg1);
		
		System.out.println("执行doFilter方法后");
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		String initParam=arg0.getInitParameter("res");
		System.out.println("取得初始化参数："+initParam);
		
	}
	
	
}

