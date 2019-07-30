package sef.module7.activity;

import java.util.Calendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class CurrencyTest1 extends TestCase {
	
	Log logger = LogFactory.getLog(this.getClass());
	
	public void testCreateCurrency(){
		try{
		Denomination d = new DenominationImpl("USD", "U.S. Dollar", "$");
		Currency c = new CurrencyImpl(25.5f, d);
		
		assertEquals(c.getValue(), 25.5f);
		
		Denomination temp = c.getDenomination();
		assertNotSame(d, temp);
		assertTrue(d.equals(temp));
		
		Calendar tempCal = c.getCreateDate();
		tempCal.set(1977, 8, 13);
		
		assertFalse(tempCal.equals(c.getCreateDate()));
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			logger.error(sef.module.percentage.Percentage.setFailedCount(true,1));
		}
	}

	

}
