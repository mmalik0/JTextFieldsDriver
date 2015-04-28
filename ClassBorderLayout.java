import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;


public class ClassBorderLayout extends JFrame {
	private JButton button1, button2, button3, button4, button5 ;
	public ClassBorderLayout(){
	button1 = new JButton("a");
	button2 = new JButton("b");
	button3 = new JButton("c");
	button4 = new JButton("d");
	button5 = new JButton("e");
	
	setLayout(new BorderLayout());
	
	add(button1, BorderLayout.LINE_END);
	add(button2, BorderLayout.BEFORE_FIRST_LINE);
	add(button3, BorderLayout.BEFORE_LINE_BEGINS);
	add(button4, BorderLayout.AFTER_LAST_LINE);
	add(button5, BorderLayout.CENTER);
	
	setVisible(true);
	setSize(300,300);
	
	}
}
