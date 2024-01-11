package BCA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	public Calculator() {
		JFrame frame = new JFrame();
		
		JLabel txtLabel = new JLabel("Amount");
		frame.add(txtLabel);
		txtLabel.setBounds(100, 50, 250, 40);
		JTextField txtField1 = new JTextField(20);
		frame.add(txtField1);
		txtField1.setBounds(220, 50, 150, 40);
		
		JLabel txtLabel2 = new JLabel("Interest Rate Field");
		frame.add(txtLabel2);
		txtLabel2.setBounds(100, 100, 250, 40);
		JTextField txtField2 = new JTextField(20);
		frame.add(txtField2);
		txtField2.setBounds(220, 100, 150, 40);
		
		JLabel txtLabel3 = new JLabel("Month Field");
		frame.add(txtLabel3);
		txtLabel3.setBounds(100, 150, 250, 40);
		JTextField txtField3 = new JTextField(20);
		frame.add(txtField3);
		txtField3.setBounds(220, 150, 150, 40);
		
		
		JButton btn = new JButton("Click");
		btn.setBounds(220, 200, 100, 35);
		frame.add(btn);
		
		JLabel lblInterest = new JLabel("Interest");
		frame.add(lblInterest);
		lblInterest.setBounds(110, 260, 250, 40);
		JTextField fieldInterest = new JTextField(20);
		fieldInterest.setEditable(false);
		frame.add(fieldInterest);
		fieldInterest.setBounds(220, 260, 150, 32);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int amount= Integer.parseInt(txtField1.getText());
				int rate= Integer.parseInt(txtField2.getText());
				int month= Integer.parseInt(txtField3.getText());
				
				int interestYearly = (amount * rate )/100;	
				int monthlyInterest = interestYearly/12;
				System.out.println("Interest: " +month * monthlyInterest);
				fieldInterest.setText(String.valueOf(month * monthlyInterest));
				
			}
		});
		frame.setSize(500, 600);
		frame.setTitle("Calculator");
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Calculator();
	}
}
