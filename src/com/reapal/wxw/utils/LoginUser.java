package com.reapal.wxw.utils;


import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class LoginUser implements HttpSessionBindingListener {

	private String name;
	public LoginUser(String name){
		this.setName(name);
		
	}
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("��session�б���Ķ���name��"+this.getName()+",session ID="+event.getSession().getId());

	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("��session���Ƴ��Ķ���name��"+this.getName()+",session ID="+event.getSession().getId());

	}

	
	

}
