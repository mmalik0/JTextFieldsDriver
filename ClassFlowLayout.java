import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClassFlowLayout extends JFrame {
	private JButton button1, button2, button3, button4, button5 ;
	public ClassFlowLayout(){
	button1 = new JButton("aF");
	button2 = new JButton("bF");
	button3 = new JButton("cF");
	button4 = new JButton("dF");
	button5 = new JButton("eF");
	add(button1);
	add(button2);
	add(button3);
	add(button4);
	add(button5);
	
	setLayout(new FlowLayout());
	setVisible(true);
	setSize(300,300);
	}
}