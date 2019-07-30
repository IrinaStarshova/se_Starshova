package sef.module3.activity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class ArrayStackTest1 extends TestCase {
	
	private String test[] = { "Curly", "Larry", "Moe", "Shemp" };
	Log logger = LogFactory.getLog(this.getClass());
	
	public void testArrayStackCreateNormal(){
		try{
		ArrayStack stack = new ArrayStack(3);
		assertEquals(stack.getMaximum(), 3);
		assertEquals(stack.getCount(), 0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}

	}
	
	public void testArrayStackCreateException() {
		try{
		ArrayStack stack = new ArrayStack(-10);
		assertEquals(stack.getMaximum(), 1);
		assertEquals(stack.getCount(), 0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	public void testPush() {
		try{
		ArrayStack stack = new ArrayStack(3);
		assertEquals(stack.push(test[0]), true);
		assertEquals(stack.getCount(), 1);
		
		assertEquals(stack.push(test[1]), true);
		assertEquals(stack.getCount(), 2);
		
		
		assertEquals(stack.push(test[2]), true);
		assertEquals(stack.getCount(), 3);
		
		assertEquals(stack.push(test[3]), false);
		assertEquals(stack.getCount(), 3);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	public void testPeek(){
		try{
		ArrayStack stack = new ArrayStack(3);
		assertEquals(stack.push(test[0]), true);
		assertSame(stack.peek(), test[0]);
		
		assertEquals(stack.push(test[1]), true);
		assertSame(stack.peek(), test[1]);
		
		assertEquals(stack.push(test[2]), true);
		assertSame(stack.peek(), test[2]);
		
		assertEquals(stack.push(test[3]), false);
		assertSame(stack.peek(), test[2]);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
	}
	
	public void testPop(){
		try{
		ArrayStack stack = new ArrayStack(3);
		assertEquals(stack.push(test[0]), true);		
		assertEquals(stack.push(test[1]), true);
		assertEquals(stack.push(test[2]), true);
		
		assertSame(stack.pop(), test[2]);
		assertEquals(stack.getCount(), 2);
		
		assertSame(stack.pop(), test[1]);
		assertEquals(stack.getCount(), 1);
		
		assertSame(stack.pop(), test[0]);
		assertEquals(stack.getCount(), 0);
		
		assertNull(stack.pop());
		assertEquals(stack.getCount(), 0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			fail();
		}
		
	}
	
	public void testFindElement(){
		try{
		ArrayStack stack = new ArrayStack(3);
		assertEquals(stack.push(test[0]), true);		
		assertEquals(stack.push(test[1]), true);
		assertEquals(stack.push(test[2]), true);
		
		assertEquals(stack.findElement(test[0]), 2);
		assertEquals(stack.findElement(test[1]), 1);
		assertEquals(stack.findElement(test[2]), 0);
		}catch(AssertionFailedError e){
			logger.error(sef.module.percentage.Percentage.setFailedCount(1, e.getMessage()));
			logger.error(sef.module.percentage.Percentage.setFailedCount(true,6));
		}
	}
		
	



}
