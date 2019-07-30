package sef.module11.activity.console;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class ConsoleTextEditor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Please, enter a name of file where the text will be saved");
			
			String name = in.readLine();
			
			System.out.println("Please, enter a path where the file will be created (optional)");
			
			String where = in.readLine();
			
			if (name != null && !name.isEmpty()) {
				String path = "C:\\workspace\\";
				
				if (where != null && !where.isEmpty()) {
					if (where.lastIndexOf("\\") < 0) 
						where = where + "\\";
					
					path = where;
				}
				
				File file = new File(String.format(path + "%s.txt", name));
			
				System.out.println("Enter a string or type 'END' to exit");
				
				StringBuilder text = new StringBuilder();
				
				String line = "";
				while(!line.equals("END")){
					line = in.readLine();
					
					text.append(line + System.lineSeparator());
					
					if (line.equals("END"))
						System.out.println("The End");
					else
						System.out.println("You typed: " + line);
				}
				
				FileWriter fw = new FileWriter(file.getAbsolutePath());
				
				Writer output = new BufferedWriter(fw);
				
				output.write(text.toString());
				output.flush();
				output.close();
				
				System.out.println("Your file was saved");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
