package sef.module8.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SpecifyExceptionSample {
	
public static void main(String arg[]){
		try {
			BufferedReader br = openFileForReading("someFileName.txt");
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}	
	
	public static BufferedReader openFileForReading(String fileName) throws IOException{

		FileReader fr = null;
	
		System.out.println("Trying to open " + fileName + " for reading");
		fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		return br;
	}
}
