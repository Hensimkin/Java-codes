package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import plants.Plant;

public class ZooPanel22 extends JPanel implements Runnable ,ActionListener
{

	private final String BACKGROUND_PATH="C:\\Users\\hanig\\Desktop\\assignment2_pictures";
	private BufferedImage pic=null;
	Plant plant=null;
	Color c;
	
	public ZooPanel22()
	{
		super();
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
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
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(pic==null)
		{
			if(c==Color.green)
			{
				g.setColor(Color.GREEN);
				g.fillRect(0, 0, getWidth(),getHeight());
			}
			if(c==Color.white)
			{
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, getWidth(),getHeight());
			}
		}
		else
		{
			g.setColor(null);
			g.drawImage(pic,0,0,getWidth(),getHeight(), this);
		}
	}

	public void run() 
	{
		
	}
	
	public void setGreen()
	{
		this.pic=null;
		c=Color.green;
	}
	
	public void setNatural()
	{
		this.pic=null;
		c=Color.white;
	}

}
