package sef.module15.sample;

public class AutoBoxingSample {
	public static void main(String[] args) { 
		
		setInteger(99);
		setInteger(new Integer(99));
	
		setFloat(9.9f);
		setFloat(new Float(9.9f));
		
		@SuppressWarnings("unused")
		Float f = 9.9f;
		@SuppressWarnings("unused")
		int i = new Integer(99);
		double d = new Integer(99);
//		String s = new Integer(99);
//		short sh = (Short) new Integer(99);
	}
	
	
	public static void setInteger(int i){
		System.out.println(i);
	}
	
	public static void setFloat(Float i){
		System.out.println(i);
	}

}
