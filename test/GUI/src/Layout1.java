import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Layout1 extends JFrame{
	private JLabel d;
	
	public Layout1(){
		super("window1");
		setLayout(new FlowLayout());
		
		d=new JLabel("Hello how r u ");
		d.setToolTipText("Khan 027");
		add(d);
	}
}

//import java.awt.event.ActionEvent;
//import javax.swing.JButton;
//import javax.swing.JTextField;
//import javax.swing.JPasswordField; 