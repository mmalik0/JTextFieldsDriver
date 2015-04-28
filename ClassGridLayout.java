
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClassGridLayout extends JFrame{
	private JButton button1, button2, button3, button4;
	public ClassGridLayout(){
		button1 = new JButton("a");
		button2 = new JButton("s");
		button3 = new JButton("d");
		button4 = new JButton("f");
		
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		
		
		setLayout(new GridLayout(2,2));
		setVisible(true);
		setSize(300,300);
		
	}

}
