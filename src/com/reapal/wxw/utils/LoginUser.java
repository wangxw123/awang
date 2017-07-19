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
		System.out.println("在session中保存的对象，name："+this.getName()+",session ID="+event.getSession().getId());

	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("在session中移除的对象，name："+this.getName()+",session ID="+event.getSession().getId());

	}

	
	

}
