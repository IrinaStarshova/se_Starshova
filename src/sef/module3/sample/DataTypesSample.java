package sef.module3.sample;

public class DataTypesSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x = 1; 
		double y = 2.0; 
		byte a = 'a';
		short b = 'b';
		
		y = x; // Assigned an int value to double
			   // no compilation error since double is
			   // much wider than int
		System.out.println(y);
		
		b = a; // Assigned an byte value to short
			   // no compilation error since short is
		      // much wider than byte
		System.out.println(b);
	}

}
