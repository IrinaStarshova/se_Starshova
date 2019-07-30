package sef.module8.activity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AccountTest1 extends TestCase {

	Log logger = LogFactory.getLog(this.getClass());
	
	public void testNormalAccountCreation(){
		try {
			Account a = new Account("ValidName123");
			assertEquals(a.getName(), "ValidName123");
		} catch (AccountException e) {
			// TODO Auto-generated catch block
			fail();
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
			}
	}
	
	public void testInvalidAccountCreation(){
	
		try{

			try {
			@SuppressWarnings("unused")
			Account a = new Account("InvalidName"); 

			} catch (AccountException ex) {

			assertEquals(ex.getName(), "InvalidName");
			}

			try {
			@SuppressWarnings("unused")
			Account b = new Account("12345");

			} catch (AccountException ex) {
			assertEquals(ex.getName(), "12345");
			}

			}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
			}
		
	}
	
	public void testThrowAccountException(){
		try {
			new Account("Inv");
			fail();
		} catch (AccountException e) {
			assertTrue(true);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	@SuppressWarnings("static-access")
	public void testAccountExceptionMessageSent(){
		
		try {
			new Account("aad");
			fail();
		}catch (AccountException e) {
			
			Pattern pattern = Pattern.compile("[a-zA-Z]\\d");
			Matcher matcher = pattern.matcher(e.getName());
			
			if(e.getName().length()<4){
				assertEquals("Name must be longer than 4 characters", e.NAME_TOO_SHORT);
			}
			
			if(!(e.getName().length()>=4 && matcher.find())){
				assertEquals("Name must contain a combination of letters and numbers", e.NAME_TOO_SIMPLE);
			}
				
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			logger.error(sef.module.percentage.Percentage.setFailedCount(true,4));
		}
	}
}

			
			
				

				
				
				
				
				


