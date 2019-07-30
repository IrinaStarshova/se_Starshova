package sef.module6.activity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class Point2DTest1 extends TestCase{
		
	Log logger = LogFactory.getLog(this.getClass());
	
	public void testPoint2dDefaultCreate(){
		try{
		Point2D point = new Point2DImpl();
		assertEquals(point.getX(), 0.0);
		assertEquals(point.getY(), 0.0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	public void testPoint2dCreate(){
		try{
		Point2D point = new Point2DImpl(3,2);
		assertEquals(point.getX(), 3.0);
		assertEquals(point.getY(), 2.0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	public void testMove(){
		try{
		Point2D point = new Point2DImpl(1,1);
		point.move(-10, 2);
		assertEquals(point.getX(), -10.0);
		assertEquals(point.getY(), 2.0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	public void testTranslate(){
		try{
		Point2D point = new Point2DImpl(3,2);
		point.translate(1, 4);
		assertEquals(point.getX(), 4.0);
		assertEquals(point.getY(), 6.0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	public void testEquals(){
		try{
		Point2D point1 = new Point2DImpl(3,2);
		Point2D point2 = new Point2DImpl(3,2);
		Point2D point3 = new Point2DImpl(2,3);
		
		assertTrue(point1.equals(point2));
		assertFalse(point1.equals(point3));
		assertTrue(point1.equals(3,2));
		assertFalse(point1.equals(9,9));	
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	public void testGetDistance(){
		try{
		Point2D point1 = new Point2DImpl(5,1);
		Point2D point2 = new Point2DImpl(1,-2);
		assertEquals(point1.getDistance(point2), 5.0);
		assertEquals(point2.getDistance(5, 1), 5.0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			logger.error(sef.module.percentage.Percentage.setFailedCount(true,6));
		}
	}
}
