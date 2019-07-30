package sef.module15.sample;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class InnerClassSample extends JFrame {
	
	
	public class InnerWindowAdapter extends WindowAdapter{
		
		@Override
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
	
	public InnerClassSample(){
		setSize(300,300);
		setVisible(true);
		addWindowListener(new InnerWindowAdapter());
	}
	
	public static void main(String arg[]){
		InnerClassSample main = new InnerClassSample();
		InnerWindowAdapter inner = main.new InnerWindowAdapter();
	}

}
