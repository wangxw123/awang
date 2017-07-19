package com.reapal.wxw.dao.proxy;

import com.reapal.wxw.dao.IUserDAO;
import com.reapal.wxw.dao.impl.UserDAOImpl;
import com.reapal.wxw.dbc.DatabaseConnection;
import com.reapal.wxw.vo.User;

public class UserDAOImplProxy implements IUserDAO{
	private DatabaseConnection dbs=null;
	private IUserDAO iud=null;
	public UserDAOImplProxy()throws Exception{
		dbs=new DatabaseConnection();
		iud=new UserDAOImpl(dbs.getConnection());
		
		
	}
	public boolean findLogin(User user) throws Exception {
		boolean flag=false;
		flag=iud.findLogin(user);
		dbs.close();
		return flag;
	}
	
}
