package com.reapal.wxw.utils;


import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ServletRequestLis implements ServletRequestListener {

	public void requestDestroyed(ServletRequestEvent event) {
		System.out.println("reque���٣�http://"+event.getServletRequest().getRemoteAddr()+event.getServletContext().getContextPath());

	}

	public void requestInitialized(ServletRequestEvent event) {
		System.out.println("reque��ʼ����http://"+event.getServletRequest().getRemoteAddr()+event.getServletContext().getContextPath());
	}

	/**
	 * Constructor of the object.
	 */
	public ServletRequestLis() {
		super();
	}

}
