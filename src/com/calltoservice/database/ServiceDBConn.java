package com.calltoservice.database;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;
import com.mysql.jdbc.Connection;

public final class ServiceDBConn {

	@Resource(name="jdbc/dbdemo")
	private static DataSource ds;
	
	public static final Connection getConn() throws SQLException{
		return (Connection) ds.getConnection();		
	}
}
