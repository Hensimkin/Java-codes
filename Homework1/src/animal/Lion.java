package animal;
import diet.Carnivore;
import food.EFoodType;
import food.IEdible;
import mobility.*;
import diet.IDiet;
import utilities.MessageUtility;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * a lion type of animal that extend the roar class
* @author Hen simkin 
 * @author Adir melker
 */
public class Lion extends Roar
{
	private final static Point start=new Point(20,0);
	private final static IDiet diet=new Carnivore();
	private int scarCount=0;
	
	
	/**
	 * a contractor the give the animal a name
	 * @param name
	 */
	public Lion(String name)
	{
		super(name,start);
		MessageUtility.logConstractor("Lion", name);
		super.setWeight(408.2);
		super.setDiet(diet);
	}
	
	public Lion(String name,int size,String col,int horSpeed,int verSpeed)
	{
		super(name,start,size,col,horSpeed,verSpeed);
		super.setWeight(408.2);
		super.setDiet(diet);
	}
	
	
	/**
	 * a contractor the give the animal a name and start point
	 * @param name
	 * @param point
	 */
	public Lion(String name,Point point)
	{
		super(name,point);
		MessageUtility.logConstractor("Lion", name);
		super.setWeight(408.2);
		super.setDiet(diet);
	}
	
	
	/**
	 * check if the bear can eat that food 
	 * @param food
	 * 			food type 
	 * @return
	 * 		true if he can eat this food,or false if he dont
	 */
	public boolean eat(IEdible food)
	{
		int z;
		double weight1=super.getDiet().eat(this, food);
		if (weight1>0)
		{
			Random temp=new Random();
			z=temp.nextInt(2);
			this.scarCount=this.scarCount+z;
			super.setWeight(weight1);
			super.makeSound();
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	public EFoodType getFoodtype()
	{
		return EFoodType.NOTFOOD;
	}

	
	
	public String toString() 
	{
		return "[Lion:]" + super.getName();
	}
	
	
	
	public int getScars()
	{
		MessageUtility.logGetter(this.getName(), "getScars", scarCount);
		return this.scarCount;
	}
	
    
	
	public void roar()
	{
		MessageUtility.logSound(super.getName(),"Roars, then stretches and shakes its mane");
	}
	
	
	public void drawObject (Graphics g)
	{
		if (super.getColor()=="blue")
		{
			g.setColor(Color.blue);
		}
		else if(super.getColor()=="red")
		{
			g.setColor(Color.red);
		}
		else
		{
			g.setColor(null);
		}
		if(super.getX_dir()==1)
		{
			g.drawImage(img1, location.x-size/2, location.y-size/10, size/2, size, pan);
		}
		 else // giraffe goes to the left side
		g.drawImage(img2, location.x, location.y-size/10, size/2, size, pan);
	}
	
	
	public void dircheck(Point p)
	{
		if(start.checkx(p)==true)
		{
			super.setX_dir(1);
		}
		else
		{
			super.setX_dir(-1);
		}
	}
	

	
	



	

}
