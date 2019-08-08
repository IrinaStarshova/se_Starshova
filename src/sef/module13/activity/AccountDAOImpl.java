package sef.module13.activity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {

	private Statement statement;

	public AccountDAOImpl(Connection conn) {
		try {
			statement = conn.createStatement();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public List<Account> findAccount(String firstName, String lastName){
        ResultSet result;
        List<Account> matchingAccounts=null;
		try {
			matchingAccounts = new ArrayList<>();
            String sql = "SELECT * FROM ACCOUNT WHERE FIRST_NAME LIKE'" + firstName+"%'" +
                    " AND LAST_NAME LIKE'" + lastName+"%'" + " ORDER BY ID";
            try{
			result = statement.executeQuery(sql);}
            catch (Exception e) {
                throw new AccountDAOException(AccountDAOException.ERROR_FIND_NAME,e);
            }
            while (result.next()) {
                matchingAccounts.add(new AccountImpl(result.getInt("ID"),
                        result.getString("FIRST_NAME"),
                        result.getString("LAST_NAME"),
                        result.getString("E_MAIL")));
            }
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return matchingAccounts;
	}

	public Account findAccount(int id) {
		try {
            String sql = "SELECT * FROM ACCOUNT WHERE ID =" + id;
            ResultSet result;
            try {
            result = statement.executeQuery(sql);
            } catch (Exception e) {
                throw new AccountDAOException(AccountDAOException.ERROR_FIND_ID,e);
            }
            if (result.next()) {
                    return new AccountImpl(result.getInt("ID"),
                            result.getString("FIRST_NAME"),
                            result.getString("LAST_NAME"),
                            result.getString("E_MAIL"));
            }

        }catch (Exception e){

			System.out.println(e.getMessage());
            e.printStackTrace();
		}
		return null;
	}


	public boolean insertAccount(String firstName, String lastName, String email) {
		int result=0;
		try {
			String sql="INSERT INTO ACCOUNT VALUES (ACCOUNT_SEQ.NEXTVAL, '"+
					firstName + "','" + lastName + "','" + email + "')";

			try {
				result = statement.executeUpdate(sql);
			} catch (Exception e) {
				throw new AccountDAOException(AccountDAOException.ERROR_INSERT_ACCOUNT,e);
			}
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return result != 0;
	}

}
