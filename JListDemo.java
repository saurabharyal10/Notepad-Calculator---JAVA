package BCA;
import javax.swing.*;
public class JListDemo extends JFrame{
	public JListDemo() {
//		JListDemo list = new JListDemo(cityList);
		DefaultListModel cityList = new DefaultListModel();
		cityList.addElement("Mumbai");
		cityList.addElement("Delhi");
		cityList.addElement("New York");
		cityList.addElement("London");
		cityList.addElement("Banglore");
		
		JList cities = new JList(cityList);
		cities.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JPanel panel = new JPanel();
		
		add(panel);
//		panel.add(cityList);
		
		setSize(300,300);
		setTitle("List");
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new JListDemo();
	}
}
