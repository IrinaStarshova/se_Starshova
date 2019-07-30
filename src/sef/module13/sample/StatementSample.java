package sef.module13.sample;

import java.sql.*;

import oracle.jdbc.driver.OracleDriver;

public class StatementSample {

	//	Take note that not all statements are supported by all servers
	//	Some statements, like a few used here, are not STANDARD SQL statements
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
			System.out.println("Connection successfully established!");
			
			//	This statement lists all tables found in the currently selected
			// 	database, which in this case is the 'dog' database as defined
			//	in the URL set when establishing a connection
			System.out.println("\n***List of Tables in '" + username + "' schema***");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM USER_TABLES");			
			
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			
			System.out.println("\n***List of Columns in 'Account' Table***");
			
			//	This statement lists all columns found in the currently selected
			// 	table, which in this case is the 'dog' table
			rs = st.executeQuery("SELECT COLUMN_NAME FROM USER_TAB_COLUMNS WHERE TABLE_NAME = 'ACCOUNT'");			
			
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			
			System.out.println("\n***List all entries in the Account Table***");
			
			//	This statement is a STANDARD SQL Statement
			//	This statement lists all dog records from the 'dog' table
			rs = st.executeQuery("SELECT * FROM ACCOUNT");			
			
			while(rs.next()){
				System.out.println(rs.getString(1) + " - " + 
									rs.getString(2) + " - " +
									rs.getString(3) + " - " +
									rs.getString(4));
								
			}
			
			rs.close();
			st.close();
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
