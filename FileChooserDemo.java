package BCA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooserDemo extends JFrame {
	public FileChooserDemo() {
		JFileChooser fileChooser = new JFileChooser();
		JButton fileOpenBtn = new JButton("Open");
		
		fileOpenBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fileChooser.showOpenDialog(null);
				
				File selectedFile = fileChooser.getSelectedFile();
				System.out.println("Selected File path:" +selectedFile.getAbsolutePath());
				
			}
		});
		add(fileOpenBtn);
		setSize(300,300);
		setVisible(true);
}
	public static void main(String[] args) {
		new FileChooserDemo();
	}
}
