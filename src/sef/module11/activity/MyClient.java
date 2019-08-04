package sef.module11.activity;

public class MyClient {
    public static void main(String[] args) {
        MyTextEditor editor = new MyNotepad();
        String text = editor.typeIn();
        editor.saveAs(text, args[0]);
    }
}
