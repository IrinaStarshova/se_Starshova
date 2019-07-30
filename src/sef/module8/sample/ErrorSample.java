package sef.module8.sample;

public class ErrorSample {
	
	//This is an example of a badly done recursive call that results in an error
	public static void main(String arg[]){
		infinity();
	}
	
	public static void infinity(){
		System.out.println("Ifinity!");
		infinity();
	}
}
