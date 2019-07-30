package sef.module3.sample;

public class OperatorSample {
	
	public static void main(String[] args){
		
	int x=1;
	int y=2;
	int z;
	
	z = x + y;	// Assignment operator
	System.out.println(z);
	z+=y; 
	System.out.println(z);
	z = ++x; // Arithmetic operators
	System.out.println(z);
	z = ++x; // Arithmetic operators
	System.out.println(z);
	System.out.println(z < x); //relational operator
	System.out.println(z < x || x > y); //logical operator
	System.out.println(z = x  > y ? x: y ); 
	}
}
