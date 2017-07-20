package com.reapal.wxw.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.reapal.wxw.dao.IUserDAO;
import com.reapal.wxw.vo.User;

public class UserDAOImpl implements IUserDAO{
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	public UserDAOImpl(Connection conn){
		this.conn=conn;
		
	}
	public boolean findLogin(User user) throws Exception {
		boolean flag=false;
		try{
		String sql="select name from user where userid=? and password=?";
		
		this.pstmt=conn.prepareStatement(sql);
		
		pstmt.setString(1, user.getUserid());
		pstmt.setString(2, user.getPassword());
		
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			user.setName(rs.getString(1));
			flag=true;
			
		}
		}catch(Exception e){
			throw e;
		}
		if (pstmt!=null) {
			this.pstmt.close();
		}
		
		return flag;
		
		
	}
	
	
}
