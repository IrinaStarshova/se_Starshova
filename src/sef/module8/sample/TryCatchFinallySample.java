package sef.module8.sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinallySample {

	public static void main(String arg[]){
		
		@SuppressWarnings("unused")
		BufferedReader br = openFileForReading("someFileName.txt");
	}	
	
	public static BufferedReader openFileForReading(String fileName){

		FileReader fr = null;
		BufferedReader br = null;
		try {
			System.out.println("Trying to open " + fileName + " for reading");
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			return br;
			
		} catch (FileNotFoundException e) {
			return null;
		}finally{
			
			//no matter what happens, attempt to close the stream
			try {
				System.out.println("Closing possibile stream");
				if(fr!= null){
					fr.close();
				}
				if(br!= null){
					br.close();
				}
				
			} catch (IOException e) {
				// Do nothing except display the stack trace
				
				e.printStackTrace();
			}
		}
	}
}
