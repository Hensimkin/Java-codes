package graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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
 * class that make and add buttons to the panel in the main frame
 * @author Adir Melker 316614569 and Hen Simkin 208514109
 *
 */
public class ZooPanel extends JPanel implements Runnable ,ActionListener
{
	int i=0;
	Plant plant=null;
	JButton addanimal;
	JButton moveanimal;
	JButton clear;
	JButton food;
	JButton info;
	JButton exit;
	Animal ao=null;
	AddAnimalDialog a;
	String name;
	Table z;
	private static final String BACKGROUND_PATH="C:\\Users\\hanig\\Desktop\\assignment2_pictures";
	static BufferedImage pic=null;
	//static Animal[] array=new Animal[10];
	static ArrayList<Animal> array=new ArrayList<Animal>(10);
	JTable table;
	String []col= {"Animal","Color","weight","Hor.Speed","Ver.Speed","Eat Counter"};
	static Object[][] data= new Object[10][6];
	public void run() 
	{
		
	}
	/**
	 * Default Contractor that add buttons to the panel 
	 */
	public ZooPanel()
	{
		
		addanimal=new JButton("Add Animal");
		addanimal.addActionListener(this);
		moveanimal=new JButton("Move Animal");
		moveanimal.addActionListener(this);
		clear=new JButton("Clear");
		clear.addActionListener(this);
		food=new JButton("Food");
		food.addActionListener(this);
		info=new JButton("Info");
		info.addActionListener(this);
		exit=new JButton("Exit");
		exit.addActionListener(this);
		addanimal.setFocusable(false);
		moveanimal.setFocusable(false);
		clear.setFocusable(false);
		food.setFocusable(false);
		info.setFocusable(false);
		exit.setFocusable(false);
		this.setBackground(Color.blue);
		this.add(addanimal);
		this.add(moveanimal);
		this.add(clear);
		this.add(food);
		this.add(info);
		this.add(exit);
	}
	
	
	
	public void actionPerformed(ActionEvent e) 
	{
	
		if(e.getSource()==addanimal)
		{
			if (AddAnimalDialog.i!=10)
			{
				a=new AddAnimalDialog();
				i++;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Can't add more animals","Error",JOptionPane.WARNING_MESSAGE);
			}
		}

	
			
		if(e.getSource()==clear)
		{
			
			array.clear();
			for(int i=0;i<AddAnimalDialog.i;i++)
			{
				ZooPanel.data[i][0]=null;
				ZooPanel.data[i][1]=null;
				ZooPanel.data[i][2]=null;
				ZooPanel.data[i][3]=null;
				ZooPanel.data[i][4]=null;
				ZooPanel.data[i][5]=null;
			}
			AddAnimalDialog.i=0;
			
		}
		
		if(e.getSource()==exit)
		{
			System.exit(0);
		}
		if (e.getSource()==info)
		{
			table=new JTable(data,col);
			z=new Table(table);
		}
		if (e.getSource()==moveanimal)
		{
			if (array.isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Can't move animals","Error",JOptionPane.WARNING_MESSAGE);
			}
			else
			{
				MoveAnimalDialog m=new MoveAnimalDialog();
			}
		}
		if (e.getSource()==food)
		{
			Food food=new Food();
		}
		
	}
	
	public void manageZoo()
	{
		
	}
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(pic!=null)
		{
			g.setColor(null);
			g.drawImage(pic,0,0,getWidth(),getHeight(), this);
		}
	}
	
	static public boolean isChanged()
	{
		return true;
	}
	
	
	public void  setpic(String pic1)
	{
		try
		{
			pic = ImageIO.read(new File(BACKGROUND_PATH+"//"+pic1)); 
		}
		
		 catch (IOException e) 
		{
		    System.out.println("Cannot load image"); 
		}
	}
	

	
	
	
	
}
