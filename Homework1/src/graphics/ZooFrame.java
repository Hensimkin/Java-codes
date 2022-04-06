package graphics;
import java.awt.*;
import javax.swing.*;
import animal.*;
import diet.*;
import food.*;
import mobility.*;
import plants.*;
import utilities.*;
import zoo.*;


public class ZooFrame extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Zoo");
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		JMenuBar mb=new JMenuBar();
		frame.setJMenuBar(mb);
		JMenu file=new JMenu("File");
		mb.add(file);
		JMenu background=new JMenu("Background");
		mb.add(background);
		JMenu help=new JMenu("Help");
		mb.add(help);
		JMenuItem exit=new JMenuItem("Exit");
		file.add(exit);
		JMenuItem image=new JMenuItem("Image");
		background.add(image);
		JMenuItem green=new JMenuItem("Green");
		background.add(green);
		JMenuItem none=new JMenuItem("None");
		background.add(none);
		JMenuItem help2=new JMenuItem("Help");
		help.add(help2);

	}

}
