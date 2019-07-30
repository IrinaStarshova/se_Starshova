
package sef.module14.sample;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class LayoutFrameSample extends JFrame{

	private JLabel firstLabel;
	private JLabel secondLabel;
	private JLabel thirdLabel;
	
	public LayoutFrameSample(){
		firstLabel= new JLabel("First");
		secondLabel= new JLabel("Second");
		thirdLabel= new JLabel("Third");
		
		Container pane = getContentPane();
		FlowLayout flowLayout = new FlowLayout();
		pane.setLayout(flowLayout);
		pane.add(firstLabel ); 
		pane.add(secondLabel); 
		pane.add(thirdLabel); 
		
		setLocation(300,300);
		setSize(100,100);
		setVisible(true);
	}
	
	public static void main(String arg[]){
		
		@SuppressWarnings("unused")
		LayoutFrameSample frame = new LayoutFrameSample();
	}
}

