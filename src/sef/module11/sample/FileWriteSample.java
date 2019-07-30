package sef.module11.sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteSample {

	public static void main(String arg[]){
		File target= new File(".\\bin\\sef\\module11\\sample\\Testfile.txt");
		try {
			System.out.println("File name " + target.getCanonicalPath());
			System.out.println("New file? " + target .createNewFile());
			
			PrintWriter writer = new PrintWriter(new FileWriter(target, true));
			writer.println("Test");
			writer.println("Test");
			writer.println("Test");
		
			writer.flush();
			writer.close();
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
