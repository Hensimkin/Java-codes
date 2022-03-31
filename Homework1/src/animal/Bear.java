package animal;

import diet.IDiet;
import diet.Omnivore;
import food.*;
import mobility.*;
import utilities.MessageUtility;

public class Bear extends Roar
{
	private final static Point start=new Point(100,5);
	private final static IDiet diet=new Omnivore();
	String fur;
	
	public Bear(String name)
	{
		super(name,start);
		MessageUtility.logConstractor("Bear", name);
		super.setWeight(308.2);
		setFurColor("GREY");
		super.setDiet(diet);
	}
	
	
	
	public Bear(String name,Point point)
	{
		super(name,point);
		MessageUtility.logConstractor("Bear", name);
		super.setWeight(308.2);
		setFurColor("GREY");
		super.setDiet(diet);
	}


	
	public EFoodType getFoodtype() 
	{
		return EFoodType.MEAT;
	}


	
	public boolean eat(IEdible food) 
	{
		double weight1=super.getDiet().eat(this, food);
		if (weight1>0)
		{
			super.setWeight(weight1);
			super.makeSound();
			return true;
		}
		else
		{
			return false;
		}
	}

	
	
	public String toString() 
	{
		return null;
	}
	
	
	
	public void roar()
	{
		MessageUtility.logSound(super.getName(),"Stands on its hind legs, roars and scratches its belly");
	}
	
	
	
	public String getFur()
	{
		return this.fur;
	}
	
	
	
	public boolean setFurColor(String color)
	{
		if (color=="GREY"||color=="BLACK"||color=="WHITE")
		{
			this.fur=color;
			MessageUtility.logSetter(this.getName(), "setFurColor", color, true);
			return true;
		}
		else
		{
			MessageUtility.logSetter(this.getName(), "setFurColor", color, false);
			return false;
		}
	}
	 

	

}
