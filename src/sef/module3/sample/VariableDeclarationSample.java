package sef.module3.sample;
import java.util.Date;

public class VariableDeclarationSample {

	public static void main(String[] args) {
		
		//	Declaring an 'Integer' named 'myInteger'
		int myInteger;		
		//	Declaring a 'String' named 'aString'
		String aString;		
		//	Declaring a 'Date' named 'theDateToday'
		Date theDateToday;
		
		
		//	Assigning/initializing 'myInteger' with a value of '1'
		myInteger = 1;
		// 	Assigning/initializing 'aString' with a value of 'This is a String!'
		aString = "This is a String!";
		// 	Assigning/initializing 'theDateToday' with the current date by calling 'new Date()'		
		theDateToday = new Date();
		
		
		//	Declaring and initializing an 'Integer' named 'aNewInteger' with a value of '10'
		@SuppressWarnings("unused")
		int aNewInteger = 10;
		//	Declaring and initializing a 'String' named 'aNewString' with a value of 'This is another String!'		
		@SuppressWarnings("unused")
		String aNewString = "This is another String!";
		
		System.out.println("myInteger has the value of: \t" + myInteger +
							"\naString has the value of: \t" + aString +
							"\ntheDateToday has the value of: \t" + theDateToday.toString());		
		
	}
}