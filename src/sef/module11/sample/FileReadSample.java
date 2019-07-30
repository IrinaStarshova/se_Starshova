package sef.module11.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadSample {
	
	public static void main(String arg[]){
		
		File thisFile = new File(".\\bin\\sef\\module11\\sample\\Testfile.txt");
		try {
			System.out.println("Reading contents of " + thisFile.getCanonicalPath());
			BufferedReader in = new BufferedReader(new FileReader(thisFile));
			
			String line="\n";
			do{
				System.out.println(line);
				line = in.readLine();
			}while(line != null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
