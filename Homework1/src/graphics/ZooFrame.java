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
		//exit.addActionListener(new ActionListener() {
			//@Override
			//public void actionPerformed(ActionEvent e) {
				
			//}
		//});
		JMenuItem green=new JMenuItem("Green");
		background.add(green);
		green.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
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
				label.setBackground(Color.white);
				label.setOpaque(false);
			}
		});
		JMenuItem help2=new JMenuItem("Help");
		help.add(help2);
		help2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				JFrame message = new JFrame("Message");
				JButton button=new JButton();
				button.setBounds(470, 500, 70, 30);
				button.setText("OK");
				button.setFocusable(false);
				message.setSize(600,600);
				message.setVisible(true);
				ImageIcon pic=new ImageIcon("work.png");
				final JLabel homework = new JLabel("Home Work 2\n GUI");
				homework.setHorizontalAlignment(JLabel.RIGHT);
				homework.setHorizontalAlignment(JLabel.CENTER);
				message.getContentPane().add(homework);
				homework.setIcon(pic);
				homework.add(button);	
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{  
						message.close();
				    }
				});
				
	            
			}
		});

	}
}

