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


public class ZooFrame extends JFrame
{
	
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Zoo");
		frame.setVisible(true);
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		JLabel label=new JLabel();
		frame.add(label);
		//frame.pack();
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
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});	
		JMenuItem image=new JMenuItem("Image");
		background.add(image);
		image.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				label.setBackground(Color.white);
				ImageIcon zoo = new ImageIcon("400.jpeg"); 
				label.setIcon(zoo);
			}
		});
		JMenuItem green=new JMenuItem("Green");
		background.add(green);
		green.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(null);
				label.setBackground(Color.GREEN);
				label.setOpaque(true);
			}
		});
		JMenuItem none=new JMenuItem("None");
		background.add(none);
		none.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				label.setIcon(null);
				label.setBackground(Color.white);
				label.setOpaque(false);
			}
		});
		JMenuItem help2=new JMenuItem("Help");
		help.add(help2);
		help2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame frameMessage=new JFrame("Message");
				JLabel labelWork2=new JLabel("<html>Home Work 2<br/>GUI</html>");
				frameMessage.setSize(300,300);
				frameMessage.setVisible(true);
				frameMessage.add(labelWork2);
				ImageIcon aboutIcon=new ImageIcon("about.png");
				labelWork2.setIcon(aboutIcon);
				JButton btOk=new JButton("OK");
				btOk.setFocusable(false);
				btOk.setBounds(150,150,70,30);
				labelWork2.add(btOk);	
				btOk.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{  
						frameMessage.dispose();
				    }
				});
			}
		});

	}
}

