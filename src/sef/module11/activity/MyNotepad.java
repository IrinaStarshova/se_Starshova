package sef.module11.activity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class MyNotepad implements MyTextEditor {
    private BufferedReader in;

    MyNotepad() {
        System.out.println("Open editor");
        this.in = new BufferedReader(new InputStreamReader(System.in));
    }

    public void saveAs(String text, String name) {
        String path = ".\\bin\\sef\\module11\\activity\\";
        try {
            File file = new File(String.format(path + "%s.txt", name));
            Writer output = new BufferedWriter(new FileWriter(file.getAbsolutePath()));

            output.write(text);
            output.flush();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Your file was saved to " + path + name + ".txt");
    }

    @Override
    public String typeIn() {
        System.out.println("Enter a string or type 'END' to exit");
        StringBuilder text = new StringBuilder();
        String line = "";

        while(true){
            try {
                line = this.in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (line.equals("END")) {
                System.out.println("The End");
                break;
            } else {
                System.out.println("You typed: " + line);
                text.append(line).append(System.lineSeparator());
            }
        }
        return text.toString();
    }
}
