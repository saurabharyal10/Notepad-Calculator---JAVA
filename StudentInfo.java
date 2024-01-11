package BCA;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class StudentInfo extends JFrame {
	public StudentInfo() {
		JPasswordField passwordField = new JPasswordField();
		JCheckBox checkBox = new JCheckBox("Music");
		
		JPanel panel = new JPanel();
		panel.add(passwordField);
		add(panel);
		
		
		setSize(300,300);
		setTitle("Student Info");
		setLayout(null);
		setVisible(true);
			
	}
	public static void main(String[] args) {
		new StudentInfo();
	}
}
