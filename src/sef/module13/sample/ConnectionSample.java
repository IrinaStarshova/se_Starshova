package sef.module13.sample;

import java.sql.*;

import oracle.jdbc.driver.OracleDriver;

public class ConnectionSample {

	// This source code tries to establish a connection to a MySQL server
	// and displays a message concerning the error if connection fails
	public static void main(String[] args) {
		Connection cn = null;
		try {
			String hostName = "127.0.0.1";
			String port = "1521";
			String sid = "XE"; //name of database
			String username = "SE";
			String password = "SE";
			
			DriverManager.registerDriver(new OracleDriver());
			
			String url = "jdbc:oracle:thin:@" + hostName + ":" + port + ":"+ sid;
			
			cn = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connection successfully established! \n");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (cn != null) {
				try {
					cn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
