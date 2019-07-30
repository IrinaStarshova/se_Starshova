package sef.module8.sample;

public class CustomExceptionSample {

	public static void setAge(int age) throws CustomException{		
		if(age < 0 ){
			//create an instance and  throw at the same time
			throw new CustomException();
		}
	}
	
	public static void main(String arg[]){
		try
		{
			CustomExceptionSample.setAge(-1);
		}catch(CustomException e)
		{
			System.out.println(e.toString());
		}
	}
}
