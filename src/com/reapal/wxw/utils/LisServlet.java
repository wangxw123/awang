package com.reapal.wxw.utils;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class LisServlet implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("ÈÝÆ÷Ïú»Ù"+event.getServletContext().getContextPath());

	}

	public void contextInitialized(ServletContextEvent event) {
		System.out.println("ÈÝÆ÷³õÊ¼»¯"+event.getServletContext().getContextPath());

	}

	/**
	 * Constructor of the object.
	 */
	public LisServlet() {
		super();
	}

}
