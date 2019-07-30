package sef.module14.sample;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;

public class SimpleJFrame extends JFrame{
	
	private static final long serialVersionUID = 7414293363426035253L;
	private JLabel firstLabel;
	
	
	public SimpleJFrame(){
		firstLabel= new JLabel("First");
		Container pane = getContentPane();
		pane.add(firstLabel ); 
		
		setLocation(300,300);
		setSize(100,100);
		setVisible(true);
		
	}
	
	public static void main(String arg[]){
		
		@SuppressWarnings("unused")
		SimpleJFrame frame = new SimpleJFrame();
		
	}
}
