package sef.module8.sample;

public class ExceptionDeclarationSample {

	public static void setAge(int age){		
		if(age < 0 ){
			//create an instance and  throw at the same time
			throw new IllegalArgumentException("parameter age cannot be less than 0");
		}
	}
	
	public static void main(String arg[]){
		ExceptionDeclarationSample.setAge(-1);
	}
}
