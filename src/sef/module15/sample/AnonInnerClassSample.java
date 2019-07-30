package sef.module15.sample;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class AnonInnerClassSample extends JFrame {


	public AnonInnerClassSample(){
		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter(){

			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public static void main(String arg[]){
		new AnonInnerClassSample();
	}
	
	
	
	
}
