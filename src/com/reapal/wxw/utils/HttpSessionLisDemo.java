package com.reapal.wxw.utils;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;



public class HttpSessionLisDemo implements HttpSessionListener {

	/**
	 * Constructor of the object.
	 */
	public HttpSessionLisDemo() {
		super();
	}

	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("session´´½¨"+event.getSession().getId());
		
	}

	public void sessionDestroyed(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("sessionÏú»Ù"+event.getSession().getId());
	}

}
