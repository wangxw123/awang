package com.reapal.wxw.dao;

import com.reapal.wxw.vo.User;

public interface IUserDAO {
	public boolean findLogin(User user)throws Exception;
	
}
