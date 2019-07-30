package sef.module8.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionSample {

	public static void main(String arg[]) throws FileNotFoundException{
		
		String fileName = "someFileThatDoesNotExist.txt";
		@SuppressWarnings("unused")
		FileReader reader ;
		try{
			reader = new FileReader(fileName);
			
		}
		catch(FileNotFoundException ex){
			System.out.println("File " + fileName + " not found");			
		}
		//reader = new FileReader(fileName);
	}
}
