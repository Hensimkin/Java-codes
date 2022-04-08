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
		//addanimal.setBounds(200, 485, 50, 30);
		addanimal.setFocusable(false);
		this.setBackground(Color.blue);
		this.setBounds(10, 490, 770, 37);
		this.add(addanimal);
	}
}
