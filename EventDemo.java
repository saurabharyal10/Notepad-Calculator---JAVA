
package BCA;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventDemo extends JFrame{
       
        public EventDemo() {
                JTextField txtField = new JTextField(20);
                txtField.addKeyListener(new KeyListener() {
                       
                        @Override
                        public void keyTyped(KeyEvent e) {
                                String value = txtField.getText();
                                System.out.println("Typed........."+value);
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
                });
               
                add(txtField);
                setSize(300, 300);
                setVisible(true);
        }
        public static void main(String[] args) {
                new EventDemo();
        }

}