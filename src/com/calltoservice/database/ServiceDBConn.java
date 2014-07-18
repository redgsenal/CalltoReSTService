package com.calltoservice.database;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public final class ServiceDBConn {

	@Resource(name="dbdemo")
	private DataSource ds;
	
	public ServiceDBConn() {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/dbdemo");
		  } catch (NamingException e) {
			e.printStackTrace();
		  }
		
	}
	
	public java.sql.Connection getConn() throws SQLException{
		return ds.getConnection();
	}
}
