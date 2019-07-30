package sef.module13.activity;

import java.sql.Connection;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {

	@SuppressWarnings("unused")
	private Connection conn;

	public AccountDAOImpl(Connection conn) {
		this.conn = conn;
	}

	public List<Account> findAccount(String firstName, String lastName)
			throws AccountDAOException {
		
		return null;
	}

	public Account findAccount(int id) throws AccountDAOException {

		
		return null;
	}


	public boolean insertAccount(String firstName, String lastName, String email)
			throws AccountDAOException {

		
		return false;
	}

}
