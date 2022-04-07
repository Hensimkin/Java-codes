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
		//JLabel label = new JLabel("Hello World");
		JButton file=new JButton();
		JButton background=new JButton();
		JButton help=new JButton();
		frame.setSize(800,600);//frame size
		file.setText("File");//set buttom name
		background.setText("background");
		//help.setText("help");
		file.setSize(100,100);//butoom size
		background.setSize(100,100);
		//help.setSize(100,100);
		file.setBounds(0,0,100,100);// buttom bounds
		background.setBounds(100,0,100,100);
		//help.setBounds(200,0,100,100);
		file.setVisible(true);//buttom visible
		background.setVisible(true);
		//help.setVisible(true);

		frame.add(file);
		frame.add(background);
		//frame.add(help);
		//frame.getContentPane().add(label);
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setLocationRelativeTo(null);
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
				final JLabel homework = new JLabel("Home Work 2");
				final JLabel gu=new JLabel("GUI");
				message.getContentPane().add(homework);
				message.getContentPane().add(gu);
				message.setSize(300,300);
				message.setVisible(true);
				
			}
			
			

		});

	}
}
