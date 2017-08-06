import javax.swing.JOptionPane;

class Gui2 {
	public static void main(String[] args) {
		String f=JOptionPane.showInputDialog("Enter First number");
		String s=JOptionPane.showInputDialog("Enter Second number");
		
		int a=Integer.parseInt(f);
		int b=Integer.parseInt(s);
		int c=a+b;
		
		JOptionPane.showMessageDialog(null,"this the total "+c,"Main Window ",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,"this the total "+c,"Main Window ",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"this the total "+c,"Main Window ",JOptionPane.YES_NO_CANCEL_OPTION);
		JOptionPane.showMessageDialog(null,"this the total "+c,"Main Window ",JOptionPane.CANCEL_OPTION);
	}

}
