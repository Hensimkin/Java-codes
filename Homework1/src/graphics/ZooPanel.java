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

public class ZooPanel extends JPanel implements Runnable 
{
	public void run() 
	{
		
	}
	public ZooPanel()
	{
		JButton addanimal=new JButton("Add Animal");
		JButton moveanimal=new JButton("Move Animal");
		JButton clear=new JButton("Clear");
		JButton food=new JButton("Food");
		JButton info=new JButton("Info");
		JButton exit=new JButton("Exit");
		addanimal.setFocusable(false);
		moveanimal.setFocusable(false);
		clear.setFocusable(false);
		food.setFocusable(false);
		info.setFocusable(false);
		exit.setFocusable(false);
		this.setBackground(Color.blue);
		//this.setLayout(null);
		this.setBounds(10, 490, 770, 37);
		this.add(addanimal);
		this.add(moveanimal);
		this.add(clear);
		this.add(food);
		this.add(info);
		this.add(exit);
	}
}
