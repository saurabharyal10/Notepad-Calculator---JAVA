package BCA;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventDemo1 extends JFrame implements KeyListener{
       
        public EventDemo1() {
                JTextField txtField = new JTextField(20);
                txtField.addKeyListener(this);
                add(txtField);
                setSize(300, 300);
                setVisible(true);
               
        }
        public static void main(String[] args) {
                new EventDemo1();
        }

        @Override
        public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed.........");
        }
       
        @Override
        public void keyReleased(KeyEvent e) {
        }
       
        @Override
        public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                        System.out.println("Enter Pressed........");
                }
        }
}