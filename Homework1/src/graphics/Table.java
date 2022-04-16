package graphics;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table 
{
	JFrame frame;
	public Table(JTable table)
	{
		frame=new JFrame("Animal Table");
		frame.setSize(500,300);
		frame.setVisible(true);
		JScrollPane scroll=new JScrollPane(table);
		frame.add(scroll);
	}

}
