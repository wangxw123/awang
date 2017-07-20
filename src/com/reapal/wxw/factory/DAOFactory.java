package com.reapal.wxw.factory;

import com.reapal.wxw.dao.IUserDAO;
import com.reapal.wxw.dao.proxy.UserDAOImplProxy;

public class DAOFactory {
	public static IUserDAO getIUserDAO()throws Exception{
		return new UserDAOImplProxy();
		
	}
}
