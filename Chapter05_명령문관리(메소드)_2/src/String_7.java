import javax.swing.*;

public class String_7 extends JFrame {
	JTextField tf = new JTextField();
	
	public String_7() {
		add("North", tf);
		tf.setText(String.valueOf(10));
		setSize(300,350);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new String_7();
	}
}
