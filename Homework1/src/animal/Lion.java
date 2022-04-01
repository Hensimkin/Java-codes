package animal;
import diet.Carnivore;
import food.EFoodType;
import food.IEdible;
import mobility.*;
import diet.IDiet;
import utilities.MessageUtility;
import java.util.*;

public class Lion extends Roar
{
	private final static Point start=new Point(20,0);
	private final static IDiet diet=new Carnivore();
	private int scarCount=0;
	
	
	
	public Lion(String name)
	{
		super(name,start);
		MessageUtility.logConstractor("Lion", name);
		super.setWeight(408.2);
		super.setDiet(diet);
	}
	
	
	
	public Lion(String name,Point point)
	{
		super(name,point);
		MessageUtility.logConstractor("Lion", name);
		super.setWeight(408.2);
		super.setDiet(diet);
	}
	
	
	
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
		return "[!]" + super.getName() + "\ttotal distance:" + String.format("%.2f", super.getTotaldistance())+ "\tweight:" + this.getWeight();
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
	

	
	



	

}
