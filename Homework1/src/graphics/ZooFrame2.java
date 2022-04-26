package graphics;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import animal.*;
import diet.*;
import food.*;
import mobility.*;
import plants.*;
import utilities.*;
import zoo.*;

/**
 * class that make the main frame of the program
 * @author Adir Melker 316614569 and Hen Simkin 208514109
 *
 */

/*
public class ZooFrame2 extends JFrame
{
	private static final String BACKGROUND_PATH="C:\\Users\\hanig\\Desktop\\assignment2_pictures";
	static JFrame frame;
	static JLabel label;
	static BufferedImage pic2=null;
	static ImageIcon pic3;
	static Image pic4;
	

	public static void main(String[] args) 
	{
		
		ZooPanel1 m=new ZooPanel1();
		//ZooPanel22 m2=new ZooPanel22();
		frame = new JFrame("Zoo");
		frame.setVisible(true);
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(m,BorderLayout.PAGE_END);
		label=new JLabel();
		frame.add(label);
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
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});	
		JMenuItem image=new JMenuItem("Image");
		background.add(image);
		image.addActionListener(new ActionListener() {
			*/
			public void actionPerformed(ActionEvent e) {
				/*
				try
				{
					
					
					frame.getContentPane().setBackground(null);
		            pic2 = ImageIO.read(new File("savanna.png"));
		            label.setBounds(0,0,800,600);
		            Image pic4 = pic2.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
		            pic3 = new ImageIcon(pic4);
		            label.setIcon(pic3);
		            frame.getContentPane().add(label);
		            
				}
			
				catch(IOException a)
				{
					System.out.println("Cant load picture");
				}
				*/
				
			}
		
		});
		
		JMenuItem green=new JMenuItem("Green");
		background.add(green);
		green.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//ZooPanel m2=new ZooPanel();
				/*
				m.setGreen();
				m.repaint();
				m.setVisible(true);
				//frame.add(m2);
				frame.setVisible(true);
				*/
				frame.remove(label);
				frame.getContentPane().setBackground(Color.green);
			}
		});
		JMenuItem none=new JMenuItem("None");
		background.add(none);
		none.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				/*
				m.setNatural();
				m.repaint();
				m.setVisible(true);
				frame.setVisible(true);
				*/
				frame.remove(label);
				frame.getContentPane().setBackground(null);
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
				ImageIcon aboutIcon=new ImageIcon("about.jpeg");
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
	

	
	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		if(pic2!=null)
		{
			g.setColor(null);
			g.drawImage(pic2,0,0,getWidth(),getHeight(), this);
		}
	}
	
	 
	 
	 public void  setpic(String pic1)
		{
			try
			{
				pic2 = ImageIO.read(new File(BACKGROUND_PATH+"//"+pic1)); 
			}
			
			 catch (IOException e) 
			{
			    System.out.println("Cannot load image"); 
			}
		}
}


