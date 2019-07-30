package sef.module9.activity;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class RadarTest1 extends TestCase{
	
	Log logger = LogFactory.getLog(this.getClass());
	
		public void testRadar(){
			try{
			Radar r = new RadarImpl();
			RadarContact r1 = new RadarContactImpl("R1", 15, 1000);
			RadarContact r2 = new RadarContactImpl("R2", 360, 2000);
			RadarContact r3 = new RadarContactImpl("R3", 180, 122.3);
			
			
			r.addContact(r1);
			r.addContact(r2);
			r.addContact(r3);
			
			assertEquals(3, r.getContactCount());
			assertSame(r1, r.getContact(r1.getContactID()));
			assertSame(r2, r.getContact(r2.getContactID()));
			assertSame(r3, r.getContact(r3.getContactID()));
			}catch(AssertionFailedError e){
				logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
				fail();
			}
					
		}
		
		public void testRemove(){
			try{
			Radar r = new RadarImpl();
			RadarContact r1 = new RadarContactImpl("R1", 15, 1000);
			RadarContact r2 = new RadarContactImpl("R2", 360, 2000);
			RadarContact r3 = new RadarContactImpl("R3", 180, 122.3);
			
			r.addContact(r1);
			r.addContact(r2);
			r.addContact(r3);
			
			assertEquals(3, r.getContactCount());
			assertNull(r.removeContact("NO_CONTACT"));
			assertSame(r.removeContact("R2"), r2);
			assertNull(r.removeContact(r2.getContactID()));
			assertEquals(2, r.getContactCount());
			}catch(AssertionFailedError e){
				logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
				fail();
			}
		}
		
		@SuppressWarnings("unchecked")
		public void testGetList(){
			try{
			Radar r = new RadarImpl();
			RadarContact r1 = new RadarContactImpl("R1", 15, 1000);
			RadarContact r2 = new RadarContactImpl("R2", 360, 2000);
			RadarContact r3 = new RadarContactImpl("R3", 180, 122.3);
			
			r.addContact(r1);
			r.addContact(r2);
			r.addContact(r3);
			
			List list = r.returnContacts();
			
			assertEquals(list.size(), 3);
			assertTrue(list.contains(r1));
			assertTrue(list.contains(r2));
			assertTrue(list.contains(r3));
			
			list.remove(r1);
			assertEquals(3, r.getContactCount());
			assertSame(r1, r.getContact(r1.getContactID()));
			}catch(AssertionFailedError e){
				logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
				fail();
			}
		}
		
		@SuppressWarnings("unchecked")
		public void testGetSortedList(){
			try{
			Radar r = new RadarImpl();
			RadarContact r1 = new RadarContactImpl("R1", 15, 1000);
			RadarContact r2 = new RadarContactImpl("R2", 360, 2000);
			RadarContact r3 = new RadarContactImpl("R3", 180, -3000);
			
			r.addContact(r1);
			r.addContact(r2);
			r.addContact(r3);
			
			List list = r.returnContacts(new DistanceComparator());
			
			assertEquals(list.size(), 3);
			assertTrue(list.contains(r1));
			assertTrue(list.contains(r2));
			assertTrue(list.contains(r3));
			
			assertSame(r3, list.get(0));
			assertSame(r1, list.get(1));
			assertSame(r2, list.get(2));
			
			list.remove(r3);
			assertEquals(3, r.getContactCount());
			assertSame(r3, r.getContact(r3.getContactID()));
			}catch(AssertionFailedError e){
				logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
				fail();
			}
		}
		
		public void testGetPercentage(){	
			sef.module.percentage.Percentage.computePercentage(4);
		}
}
