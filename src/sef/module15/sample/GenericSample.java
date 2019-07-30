package sef.module15.sample;

import java.util.ArrayList;
import java.util.List;

public class GenericSample <E>{

	private E field;
	
	public static final int BIG_NUMBER = 1000;
	
	public void setValue(E arg){
		this.field =arg;
	}
	
	public E getValue(){
		return field;
	}
	
	public <T> void test(T param) {
		List<T> list = new ArrayList<T>();
	}
	
	public static void main(String arg[]){
		GenericSample<String> g1 = new GenericSample<String>();
		GenericSample<Integer> g2 = new GenericSample<Integer>();
		
		g1.setValue("Hello!");
		System.out.println(g1.getValue());
		g2.setValue(new Integer(42));
		System.out.println(g2.getValue());
		
		g2.test("Hello!");
		
	}
}
