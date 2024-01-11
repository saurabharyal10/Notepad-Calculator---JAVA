package BCA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Notepad {
	public Notepad() {
		JFileChooser fileChooser = new JFileChooser();
		JFrame frame = new JFrame();
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		
		JMenu fileMenu = new JMenu("File Menu");
		menuBar.add(fileMenu);
		
		JMenu fileEdit = new JMenu("Edit");
		menuBar.add(fileEdit);
		
		JMenu fileFormat = new JMenu("Format");
		menuBar.add(fileFormat);
		
		JMenu fileView = new JMenu("View");
		menuBar.add(fileView);
		
		JMenu fileHelp = new JMenu("Help");
		menuBar.add(fileHelp);
		
		
		JMenuItem newItem = new JMenuItem("New");
		fileMenu.add(newItem);
		JMenuItem openItem = new JMenuItem("Open");
		fileMenu.add(openItem);
		JMenuItem saveItem = new JMenuItem("Save");
		fileMenu.add(saveItem);
		JMenuItem exitMenuItem = new JMenuItem("Exit Menu");
		fileMenu.add(exitMenuItem);
		
		JMenuItem aboutItem = new JMenuItem("About");
		fileHelp.add(aboutItem);
		
		
		
		JTextArea txtArea = new JTextArea();
		frame.add(txtArea);
		
		
		
		newItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtArea.setText("");
			}
		});
		
		
		 openItem.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                     fileChooser.showOpenDialog(null);

                     File selectedFile = fileChooser.getSelectedFile();
                     System.out.println("Selected File path: "+selectedFile.getAbsolutePath());
                     String text = "";
                     try {
                   Scanner myReader = new Scanner(selectedFile);
                   while (myReader.hasNextLine()) {
                     String data = myReader.nextLine();
                     text += data;
                   }
                   myReader.close();
                 } catch (FileNotFoundException ex) {
                   System.out.println("An error occurred.");
                   ex.printStackTrace();
                 }
                     txtArea.setText(text);
             }
		 });
		
		saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.showSaveDialog(null);

                    File selectedFile = fileChooser.getSelectedFile();
                    System.out.println("Selected File path: "+selectedFile.getAbsolutePath());
                   
                    String content = txtArea.getText();
                    String path = selectedFile.getAbsolutePath();
                    try {
                            Files.write( Paths.get(path), content.getBytes());
                    } catch (IOException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                    	}
            	}
			});
		
		
		exitMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		frame.setTitle("Notepad");
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Notepad();
	}
}
