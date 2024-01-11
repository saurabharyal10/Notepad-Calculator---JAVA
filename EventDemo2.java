package BCA;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventDemo2 extends KeyAdapter{
       
        public EventDemo2() {
                JFrame frame = new JFrame();
                JTextField txtField = new JTextField(20);
                txtField.addKeyListener(this);
                frame.add(txtField);
                frame.setSize(300, 300);
                frame.setVisible(true);
               
        }
        public static void main(String[] args) {
                new EventDemo2();
        }

        public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed.........");
        }
}