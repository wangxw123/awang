package com.reapal.wxw.utils;


import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class ServletRequestAttribute implements ServletRequestAttributeListener {

	public void attributeAdded(ServletRequestAttributeEvent event) {
		System.out.println("��������----���������ƣ�"+event.getName()+"�������ݣ�"+event.getValue());

	}

	public void attributeRemoved(ServletRequestAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("ɾ������----���������ƣ�"+event.getName()+"�������ݣ�"+event.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("�滻����----���������ƣ�"+event.getName()+"�������ݣ�"+event.getValue());
	}

	/**
	 * Constructor of the object.
	 */
	public ServletRequestAttribute() {
		super();
	}

}
