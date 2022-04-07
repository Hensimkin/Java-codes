package graphics;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		JMenuBar menuBar=new JMenuBar();
		frame.setJMenuBar(menuBar);
		JMenu file=new JMenu("File");
		menuBar.add(file);
		JMenu background=new JMenu("Background");
		menuBar.add(background);
		JMenu help=new JMenu("Help");
		menuBar.add(help);
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
		help2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame message = new JFrame("Message");
				final JLabel homework = new JLabel("Home Work 2\n GUI");
				message.getContentPane().add(homework);
				message.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				message.pack();
				message.setVisible(true);
				
			}
			
			

		});

	}
}
