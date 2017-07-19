package com.reapal.wxw.utils;


import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ServletContextAttributeLis implements
		ServletContextAttributeListener {

	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("增加的属性------>名称"+event.getName()+"，属性内容"+event.getValue());
		
	}

	public void attributeRemoved(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("删除的属性------>名称"+event.getName()+"，属性内容"+event.getValue());
	}

	public void attributeReplaced(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("替换的属性------>名称"+event.getName()+"，属性内容"+event.getValue());
	}

	/**
	 * Constructor of the object.
	 */
	public ServletContextAttributeLis() {
		super();
	}

}
