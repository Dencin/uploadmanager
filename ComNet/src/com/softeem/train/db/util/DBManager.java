package com.softeem.train.db.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DBManager {
	private static final String driveclass="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String url="jdbc:sqlserver://192.168.32.21:1433;database=company";
	private static final String username="sa";
	private static final String password="123456";
	
	static BasicDataSource bs;
	
	//我们的数据源只需要配置一次所以我们采用静态块
	static{
		bs=new BasicDataSource();
		bs.setDriverClassName(driveclass);
		bs.setUrl(url);
		bs.setUsername(username);
		bs.setPassword(password);
		bs.setMaxActive(100);
	}
	public static Connection getConn(){
		Connection conn=null;
		try {
			conn=bs.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	public static void main(String[] args) {
		System.out.println(getConn());
	}

}
