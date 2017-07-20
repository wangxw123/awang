package com.reapal.wxw.utils;


import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class ServletRequestAttribute implements ServletRequestAttributeListener {

	public void attributeAdded(ServletRequestAttributeEvent event) {
		System.out.println("新增属性----》属性名称："+event.getName()+"属性内容："+event.getValue());

	}

	public void attributeRemoved(ServletRequestAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("删除属性----》属性名称："+event.getName()+"属性内容："+event.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("替换属性----》属性名称："+event.getName()+"属性内容："+event.getValue());
	}

	/**
	 * Constructor of the object.
	 */
	public ServletRequestAttribute() {
		super();
	}

}
