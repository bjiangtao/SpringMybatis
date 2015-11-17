package com.advice;

import java.sql.SQLException;

/**
 *@author: baijiangtao
 *@createtime: 2015年11月17日上午10:11:18
 *@version: V1.0
 *@Description:
 */
public class UserDao {
	
	public void update() throws SQLException{
		throw new SQLException("sqlyichang");
	}
	
	public void delete(){
		throw new RuntimeException("deleteyichang");
	}
}
