package sef.module14.sample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ComplexFrame extends JFrame{
	
	JPanel leftPanel;
	JPanel bottomPanel;
	JButton leftButtonOne;
	JButton leftButtonTwo;
	JButton leftButtonThree;
	
	JButton bottomButtonOne;
	JButton bottomButtonTwo;
	JButton bottomButtonThree;
	
	public ComplexFrame(){
		
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		
		leftPanel = new JPanel();
		leftPanel.setLayout(new GridLayout(3,1));
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(1,3));
		
		leftButtonOne = new JButton("Left-One");
		leftButtonTwo = new JButton("Left-Two");
		leftButtonThree = new JButton("Left-Three");
		leftPanel.add(leftButtonOne);
		leftPanel.add(leftButtonTwo);
		leftPanel.add(leftButtonThree);
		bottomButtonOne = new JButton("Bottom-One");
		bottomButtonTwo = new JButton("Bottom-Two");
		bottomButtonThree = new JButton("Bottom-Three");
		bottomPanel.add(bottomButtonOne);
		bottomPanel.add(bottomButtonTwo);
		bottomPanel.add(bottomButtonThree);
		
		pane.add(leftPanel, BorderLayout.WEST);
		pane.add(bottomPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String arg[]){
		new ComplexFrame();
	}
	
}
