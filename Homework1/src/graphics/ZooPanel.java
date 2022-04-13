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

public class ZooPanel extends JPanel implements Runnable ,ActionListener
{
	int i=0;
	JButton addanimal;
	JButton moveanimal;
	JButton clear;
	JButton food;
	JButton info;
	JButton exit;
	AddAnimalDialog a;
	Animal []array=new Animal[10];
	public void run() 
	{
		
	}
	public ZooPanel()
	{
		addanimal=new JButton("Add Animal");
		addanimal.addActionListener(this);
		moveanimal=new JButton("Move Animal");
		clear=new JButton("Clear");
		food=new JButton("Food");
		info=new JButton("Info");
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
			a=new AddAnimalDialog();
			//array[i]=a.getAnimal();
		}
		if(e.getSource()==exit)
		{
			System.exit(0);
		}
		if (e.getSource()==info)
		{
			
		}
	}
}
