package sef.module13.sample;

import java.sql.*;

import oracle.jdbc.driver.OracleDriver;

//	This class demonstrates the use of PreparedStatements
public class PreparedStatementSample {

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
			
			PreparedStatement pStmt = cn.prepareStatement("select * from Account where UPPER(LAST_NAME) = ? ");
			
			//	Change parameter to any keyword desired, if a record
			// 	matches the query then it will be displayed
			pStmt.setString(1,"DOE");
			
			ResultSet rs = pStmt.executeQuery();
			
			System.out.println("Printing Query results:");
			while(rs.next()){
				System.out.println(rs.getString(1) + " - " + 
							rs.getString(2) + " - " + 
							rs.getString(3) + " - " + 
							rs.getString(4));
					
			}
			
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}
