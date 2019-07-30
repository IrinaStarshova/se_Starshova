package sef.module3.sample;

public class VariableScoping {
	
	public boolean isTrue = true; // variable is available to the java world
	String name = "I'm a string"; // available to the current package 
	@SuppressWarnings("unused")
	private int a; //field
	@SuppressWarnings("unused")
	private static int b; //class variable
	
	public void run(int c)//parameter 
	{
		@SuppressWarnings("unused")
		int d; //local variable
	}
}
