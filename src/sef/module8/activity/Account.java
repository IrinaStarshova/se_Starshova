package sef.module8.activity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class represents a simple representation of an account encapsulating
 * a name 
 * 
 * @author John Doe
 *
 */
public class Account {

	private String accountName;


	/**
	 * Creates an Account object with the specified name.  If the account name
	 * given violates the minimum requirements, then an AccountException is thrown
	 * 
	 * @param accountName
	 * @throws AccountException
	 */
	public  Account(String accountName) throws AccountException{
		Pattern p = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]+$");
		Matcher m = p.matcher(accountName);
		if(accountName.length()<5)
			throw new AccountException(AccountException.NAME_TOO_SHORT,accountName);
		else if(!m.matches())
			throw new AccountException(AccountException.NAME_TOO_SIMPLE,accountName);
		else this.accountName=accountName;

	}
	
	
	/**
	 * Returns the account name
	 * 
	 * @return the account name
	 */
	public String getName(){
		return accountName;
	}
}
