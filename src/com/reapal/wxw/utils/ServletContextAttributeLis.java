package com.reapal.wxw.utils;


import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ServletContextAttributeLis implements
		ServletContextAttributeListener {

	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("���ӵ�����------>����"+event.getName()+"����������"+event.getValue());
		
	}

	public void attributeRemoved(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("ɾ��������------>����"+event.getName()+"����������"+event.getValue());
	}

	public void attributeReplaced(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("�滻������------>����"+event.getName()+"����������"+event.getValue());
	}

	/**
	 * Constructor of the object.
	 */
	public ServletContextAttributeLis() {
		super();
	}

}
