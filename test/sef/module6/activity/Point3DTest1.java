package sef.module6.activity;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Point3DTest1 extends TestCase {
	
	Log logger = LogFactory.getLog(this.getClass());
		
	public void testPoint3DDefaultCreate(){	
		try{
		Point3D point = new Point3DImpl();
		assertEquals(point.getX(), 0.0);
		assertEquals(point.getY(), 0.0);
		assertEquals(point.getZ(), 0.0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	public void testPoint3DCreate(){
		try{
		Point3D point = new Point3DImpl(3,2,9);
		assertEquals(point.getX(), 3.0);
		assertEquals(point.getY(), 2.0);
		assertEquals(point.getZ(), 9.0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	public void testMove(){
		try{
		Point3D point = new Point3DImpl(1,1,3);
		point.move(-1, 9, 7);
		assertEquals(point.getX(), -1.0);
		assertEquals(point.getY(), 9.0);
		assertEquals(point.getZ(), 7.0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	
	public void testTranslate(){
		try{
		Point3D point = new Point3DImpl(1,1,3);
		point.translate(-1, 9, 6);
		assertEquals(point.getX(), 0.0);
		assertEquals(point.getY(), 10.0);
		assertEquals(point.getZ(), 9.0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	public void testEquals(){
		try{
		Point3D point1 = new Point3DImpl(3,2,-1);
		Point3D point2 = new Point3DImpl(3,2,-1);
		Point3D point3 = new Point3DImpl(2,3,1);
		
		assertTrue(point1.equals(point2));
		assertFalse(point1.equals(point3));
		assertTrue(point1.equals(3,2, -1));
		assertFalse(point1.equals(9,9, 9));	
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
public void testGetDistance(){
		try{
		Point3D point1 = new Point3DImpl(5,1,3);
		Point3D point2 = new Point3DImpl(1,-2, 3);
		assertEquals(point1.getDistance(point2), 5.0);
		assertEquals(point2.getDistance(5, 1, 3), 5.0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			logger.error(sef.module.percentage.Percentage.setFailedCount(true,6));
		}
	}
}
