package sef.module13.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import oracle.jdbc.driver.OracleDriver;

public class InsertSample {

	public static void main(String[] args) {
		try{
			String hostName = "127.0.0.1";
			String port = "1521";
			String sid = "XE";
			String username = "SE";
			String password = "SE";
			DriverManager.registerDriver (new OracleDriver());
            String url = "jdbc:oracle:thin:@" + hostName + ":" + port + ":" + sid;
            Connection cn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection successfully established! \n");
			
			PreparedStatement pStmt 
				= cn.prepareStatement("insert into Account (FIRST_NAME, LAST_NAME, E_MAIL) VALUES (?,?,?)");
			
			//	Change parameter to any keyword desired, if a record
			// 	matches the query then it will be displayed
			pStmt.setString(1,"Clark");
			pStmt.setString(2,"Kent");
			pStmt.setString(3,"clark.kent@dailyplanet.com");
			
			int rows = pStmt.executeUpdate();
			cn.commit();	
			System.out.println(rows + " added!");
			
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}
}
