package sef.module3.sample;

public class ArrayDeclarationSample {

	public static void main(String[] args) {

		//	Array declaration sample
		@SuppressWarnings("unused")
		int[] myIntegerArray;
     	@SuppressWarnings("unused")
		String[] myStringArray;
     	
     	//	Initializing/assigning myIntegerArray with a size of 10
     	myIntegerArray = new int[10];     	
     	//	Initializing/assigning myIntegerArray with a size of 10
     	myStringArray = new String[5];
     	
     	
     	//	Another way of declaring arrays 
     	//	Declaring and Constructing an array
     	@SuppressWarnings("unused")
		int[] aNewIntegerArray = new int[5];     	
     	@SuppressWarnings("unused")
		String[] aNewStringArray = new String[3];
     	
     	
     	//	Yet, another way of declaring arrays
     	// Declaring, Constructing and Initializing an array
     	int[] anotherIntegerArray = {99,1,24,42,1};
     	String[] anotherStringArray = {"Hello", "There", "How", "Are", "You?"};
	
     	//Access the 3rd integer 
     	System.out.println("Integer array index 3 = " + anotherIntegerArray[2]);
     	
     	//Access the 1st String
     	System.out.println("String array index 0 = " + anotherStringArray[0]);

	}
}
