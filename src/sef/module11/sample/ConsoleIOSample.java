package sef.module11.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class ConsoleIOSample implements Serializable{

	private static final long serialVersionUID = 27417970278673030L;

	public static void main(String arg[]){
	
		System.out.println("Enter a string or type 'END' to exit");
		
		//System.in is a primitive input stream object dealing with raw bytes.  
		//We wrap it with an InputStreamReader so that the bytes will be parsed as characters
		//We wrap the InputStreamReader with a BufferedReader to provide us buffering capabilities
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		String line = "";
		while(!line.equals("END")){
			try {
				line = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("You typed: " + line);
		}
		System.out.println("GOODBYE!");
	}
}
