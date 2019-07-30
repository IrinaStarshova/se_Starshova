package sef.module11.activity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class Notepad implements TextEditor {
	
	private BufferedReader in;
	
	public Notepad() {
		System.out.println("Open editor");
		this.in = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public void saveAs(String text) {
		System.out.println("Please, enter a name of file where the text will be saved");
		String name = requestArgs();
		
		System.out.println("Please, enter a path where the file will be created (optional)");
		String where = requestArgs();
		
		String path = "C:\\workspace\\";
		if (where != null && !where.isEmpty()) {
			
			if (where.lastIndexOf("\\") < 0) 
				where = where + "\\";
			
			path = where;
		}
		
		try {
			File file = new File(String.format(path + "%s.txt", name));
			
			FileWriter fw = new FileWriter(file.getAbsolutePath());
			
			Writer output = new BufferedWriter(fw);
			
			output.write(text.toString());
			output.flush();
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Your file was saved");
	}

	@Override
	public String typeIn() {
		System.out.println("Enter a string or type 'END' to exit");
		
		StringBuilder text = new StringBuilder();
		
		String line = "";
		
		while(!line.equals("END")){
			line = requestArgs();
			
			text.append(line + System.lineSeparator());
			
			if (line.equals("END")) {
				System.out.println("The End");
			} else {
				System.out.println("You typed: " + line);
				text.append(line + System.lineSeparator());
			}
		}
		
		return text.toString();
	}
	
	private String requestArgs() {
		String arg = "";
		try {
			arg = this.in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arg;
	}

}
