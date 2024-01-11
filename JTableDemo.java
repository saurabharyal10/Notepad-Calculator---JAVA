package BCA;

import javax.swing.*;

public class JTableDemo{
	public JTableDemo() {
		JFrame jFrame = new JFrame();
	
		JTabbedPane tabbedPane = new JTabbedPane();
		
		String columnNames[] = {"S.No","Name","Address","Phone"};
		String[][] cells = {{"1","Binod","Gongabu","987654"},
							{"2","Pandit","Gongabu","987642"}};
		JTable table = new JTable(cells, columnNames);
		
		JPanel tab1Panel = new JPanel();
		tab1Panel.add(new JScrollPane(table));
//		tab1Panel.add(table);
		tabbedPane.addTab("Tab 1", tab1Panel);
		
		
		JSlider volumeSlider = new JSlider(0,100,50);
		volumeSlider.setPaintTrack(true);
		volumeSlider.setPaintTicks(true);
		volumeSlider.setPaintLabels(true);
//		jFrame.add(volumeSlider);
		
		volumeSlider.setMajorTickSpacing(50);
		volumeSlider.setMinorTickSpacing(5);
		
		JPanel tab2Panel = new JPanel();
		tab2Panel.add(volumeSlider);
		tabbedPane.addTab("Tab 2", tab2Panel);
		
		jFrame.add(tabbedPane);
		jFrame.setSize(400, 400);
		jFrame.setVisible(true);
	}
	public static void main(String[] args) {
		new JTableDemo();
	}
}
