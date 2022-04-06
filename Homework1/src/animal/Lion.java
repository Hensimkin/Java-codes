package animal;
import diet.Carnivore;
import food.EFoodType;
import food.IEdible;
import mobility.*;
import diet.IDiet;
import utilities.MessageUtility;
import java.util.*;

/**
 * a lion type of animal that extend the roar class
 * @author Adir
 *@author Hen
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
	

	
	



	

}
