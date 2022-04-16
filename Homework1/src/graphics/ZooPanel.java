package graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
	static Animal[] array=new Animal[10];
	//static ArrayList<Animal> array22=new ArrayList<>(10);
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
		clear=new JButton("Clear");
		food=new JButton("Food");
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
		if(e.getSource()==exit)
		{
			System.exit(0);
		}
		if (e.getSource()==info)
		{
			table=new JTable(data,col);
			z=new Table(table);
		}
		
	}
	

	
	
	
	
}
