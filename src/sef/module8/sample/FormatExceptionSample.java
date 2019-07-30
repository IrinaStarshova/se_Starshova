package sef.module8.sample;

public class FormatExceptionSample {

	public static void main(String arg[]){
		
		//The Integer.parseInt method accepts Strings which contains integers
		//so that it can transform it into a primitive integer
		int x = Integer.parseInt("42");
		System.out.println(x);
		
		//It does not accept Strings which contain non-integer values
		x = Integer.parseInt("abcd1234");
		System.out.println(x);
		
	}
}
