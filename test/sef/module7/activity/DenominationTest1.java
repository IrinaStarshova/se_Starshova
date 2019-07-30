package sef.module7.activity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class DenominationTest1 extends TestCase {
	Log logger = LogFactory.getLog(this.getClass());
	
	public void testCreateDenomination(){
		try{
		Denomination d1 = new DenominationImpl("USD", "U.S. Dollar", "$");
		Denomination d2  = new DenominationImpl("PHP", "Philippine Peso", "P");
		Denomination d3 = new DenominationImpl("USD", "United States Dollar", "$");
		
		assertEquals("USD", d1.getName());
		assertEquals("U.S. DOLLAR", d1.getDescription().toUpperCase());
		assertEquals("$", d1.getSymbol());
		
		assertEquals("PHP", d2.getName());
		assertEquals("PHILIPPINE PESO", d2.getDescription().toUpperCase());
		assertEquals("P", d2.getSymbol());
		
		assertTrue(d1.equals(d3));
		assertFalse(d1.equals(d2));
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			logger.error(sef.module.percentage.Percentage.setFailedCount(true,1));
		}
	}

}
