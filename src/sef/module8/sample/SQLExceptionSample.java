package sef.module8.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class SQLExceptionSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			String hostName = "127.0.0.1";
			String port = "1521";
			String sid = "XE1";
			// this will throw an exception since
			// XE1 is not an existing SID
			String username = "SE";
			String password = "SE";
			DriverManager.registerDriver (new OracleDriver());
            String url = "jdbc:oracle:thin:@" + hostName + ":" + port + ":" + sid;
            Connection cn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection successfully established! \n");
			
			cn.close();
		}catch(SQLException e){
			System.out.println("SQLException");
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println("Exception");
		}

	}

}
