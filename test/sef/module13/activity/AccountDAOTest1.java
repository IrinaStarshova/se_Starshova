package sef.module13.activity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

	public class AccountDAOTest1 extends TestCase {
	
	private Connection conn;
	private String url ;
	private String username;
	private String password;
	Log logger = LogFactory.getLog(this.getClass());
	
	protected void setUp() throws Exception {
		super.setUp();	
		username = "sa";
		password = "";
		Class.forName("org.h2.Driver");
        url = "jdbc:h2:~/test";
        conn = DriverManager.getConnection(url, username, password);
		conn.setAutoCommit(false);
		System.out.println("Connection successfully established!");
	}

	public void testFindID(){
		AccountDAO dao = new AccountDAOImpl(conn);
		try {
			Account result = dao.findAccount(1);
			assertEquals(result.getFirstName().toUpperCase(), "JOHN");
			assertEquals(result.getLastName().toUpperCase(), "DOE");
			assertEquals(result.getEmail().toUpperCase(), "JOHN.DOE@FASTMAIL.COM");
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
		catch (AccountDAOException e) {
			// TODO Auto-generated catch block
			fail();
		}
	}
	
	public void testFindAccountViaName(){
		AccountDAO dao = new AccountDAOImpl(conn);
		try {
			List <Account>results = dao.findAccount("J", "DOE");
			assertEquals(2, results.size());
			
			assertEquals(results.get(0).getFirstName().toUpperCase(), "JOHN");
			assertEquals(results.get(0).getLastName().toUpperCase(), "DOE");
			assertEquals(results.get(0).getEmail().toUpperCase(), "JOHN.DOE@FASTMAIL.COM");
			
			
			assertEquals(results.get(1).getFirstName().toUpperCase(), "JANE");
			assertEquals(results.get(1).getLastName().toUpperCase(), "DOE");
			assertEquals(results.get(1).getEmail().toUpperCase(), "JANE.DOE@FASTMAIL.COM");
			
		} catch (AccountDAOException e) {
			// TODO Auto-generated catch block
			fail();
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	public void testInsertAccount(){
		AccountDAO dao = new AccountDAOImpl(conn);
		try {
			boolean result = dao.insertAccount("Jack", "Bauer", "jack.bauer@ctu.gov");
			assertTrue(result);
			
		} catch (AccountDAOException e) {
			System.out.println(e.getCause().getMessage());
			fail();
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}

	}
	
	protected void tearDown() throws Exception {
		try{
		super.tearDown();
		conn.close();
		System.out.println("Connection closed!");
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			logger.error(sef.module.percentage.Percentage.setFailedCount(true,4));
		}
	}

}
