package animal;

import diet.Herbivore;
import diet.IDiet;
import food.*;
import mobility.*;
import utilities.*;


public class Turtle extends Chew
{
	private final static Point start=new Point(50,0);
	private final static IDiet diet=new Herbivore();
	private int  age=1;
	
	

	public Turtle(String name)
	{
		super(name,start);
		MessageUtility.logConstractor("Turtle", name);
		super.setWeight(1);
		setAge(age);
		super.setDiet(diet);
	}
	
	
	public Turtle(String name,Point point)
	{
		super(name,point);
		MessageUtility.logConstractor("Turtle", name);
		super.setWeight(1);
		setAge(age);
		super.setDiet(diet);
	}


	
	public EFoodType getFoodtype() 
	{
		return EFoodType.MEAT;
	}


	
	public void chew() 
	{
		MessageUtility.logSound(super.getName(),"Retracts its head in then eats quietly");
	}



	public boolean eat(IEdible food) {
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
	
	
	public boolean setAge(int age)
	{
		if (age>=0 && age <=500)
		{
			this.age=age;
			MessageUtility.logSetter(this.getName(), "setAge", age, true);
			return true;
		}
		else
		{
			MessageUtility.logSetter(this.getName(), "setAge", age, false);
			return false;
		}
	}
}
