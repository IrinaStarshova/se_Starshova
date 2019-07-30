package sef.module9.activity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class RadarContactTest1 extends TestCase {
		
	Log logger = LogFactory.getLog(this.getClass());
	
	public void testRadarContactPostiveBearing(){
		try{
		RadarContact r1 = new RadarContactImpl("R1", 15, 1000);
		RadarContact r2 = new RadarContactImpl("R2", 360, 2000);
		RadarContact r3 = new RadarContactImpl("R3", 405, 3500);
		RadarContact r4 = new RadarContactImpl("R4", 720, 3500.10);
		RadarContact r5 = new RadarContactImpl("R5", 725.3, -3024);
		
		
		assertEquals("R1", r1.getContactID());
		assertEquals(15.0, r1.getBearing());
		assertEquals(1000.0, r1.getDistance());

		
		assertEquals("R2", r2.getContactID());
		assertEquals(0.0, r2.getBearing());
		assertEquals(2000.0, r2.getDistance());

		assertEquals("R3", r3.getContactID());
		assertEquals(45.0, r3.getBearing());
		assertEquals(3500.0, r3.getDistance());
	
		
		assertEquals("R4", r4.getContactID());
		assertEquals(0.0, r4.getBearing());
		assertEquals(3500.10, r4.getDistance());
	
		
		assertEquals("R5", r5.getContactID());
		assertEquals(5.3f, (float)r5.getBearing());
		assertEquals(0.0, r5.getDistance());
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	
public void testRadarContactNegativeBearing(){
		try{
		RadarContact r1 = new RadarContactImpl("R1", -350, 1000);
		RadarContact r2 = new RadarContactImpl("R2", -360, 2000);
		RadarContact r3 = new RadarContactImpl("R3", -375.5, 3500);
		RadarContact r4 = new RadarContactImpl("R4", -720, 3500.10);
		RadarContact r5 = new RadarContactImpl("R5", -721.5, -3024);
		
		
		assertEquals("R1", r1.getContactID());
		assertEquals(10.0, r1.getBearing());
		assertEquals(1000.0, r1.getDistance());

		
		assertEquals("R2", r2.getContactID());
		assertEquals(0.0, r2.getBearing());
		assertEquals(2000.0, r2.getDistance());
		
		
		assertEquals("R3", r3.getContactID());
		assertEquals(344.5, r3.getBearing());
		assertEquals(3500.0, r3.getDistance());
		
		
		assertEquals("R4", r4.getContactID());
		assertEquals(0.0, r4.getBearing());
		assertEquals(3500.10, r4.getDistance());	
	
		
		assertEquals("R5", r5.getContactID());
		assertEquals(358.5, r5.getBearing());
		assertEquals(0.0, r5.getDistance());
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			logger.error(sef.module.percentage.Percentage.setFailedCount(true,2));
		}
	}

}
