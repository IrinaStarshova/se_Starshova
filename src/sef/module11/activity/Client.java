package sef.module11.activity;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TextEditor editor = new Notepad();
	
		String text = editor.typeIn();
		
		editor.saveAs(text);
	}

}
