package sef.module14.sample;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutFrame extends JFrame{

	private static final long serialVersionUID = -949400011808932290L;
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton;
	private JButton fourthButton;
	private JButton fifthButton;
	
	public BorderLayoutFrame(){
		firstButton= new JButton("First");
		secondButton= new JButton("Second");
		thirdButton= new JButton("Third");
		fourthButton= new JButton("Fourth");
		fifthButton= new JButton("Fifth");
		
		Container pane = getContentPane();
		pane.add(firstButton, BorderLayout.NORTH); 
		pane.add(secondButton, BorderLayout.SOUTH); 
		pane.add(thirdButton, BorderLayout.EAST); 
		pane.add(fourthButton, BorderLayout.WEST); 
		pane.add(fifthButton, BorderLayout.CENTER); 
		
		setLocation(300,300);
		setSize(200,200);
		setVisible(true);
	}
	
	public static void main(String arg[]){
		
		 @SuppressWarnings("unused")
		BorderLayoutFrame frame = new BorderLayoutFrame();
	}
}
