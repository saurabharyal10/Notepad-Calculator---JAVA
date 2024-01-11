package BCA;

import javax.swing.*;
//import javax.swing.JComboBox;

public class JComboBoxDemo extends JFrame {
	public JComboBoxDemo() {
		String[] cityStrings = {"Mumbai", "London","New York"};
		JComboBox cities = new JComboBox(cityStrings);
		cities.setSelectedIndex(1);
		
		JPanel panel = new JPanel();
		
		add(panel);
		panel.add(cities);
		
	//	System.out.println(cityStrings.setSelectedIndex(1));
		setSize(300,300);
		setTitle("Combo Box");
		//setLayout(null);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		new JComboBoxDemo();
	}
}
