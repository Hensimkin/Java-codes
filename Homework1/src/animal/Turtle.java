package animal;

import diet.Herbivore;
import diet.IDiet;
import food.*;
import mobility.*;
import utilities.*;

/**
 * a turtle type of animal that extend the chew class
 * @author Adir
 *@author Hen
 */
public class Turtle extends Chew
{
	private final static Point start=new Point(50,0);
	private final static IDiet diet=new Herbivore();
	private int  age=1;
	
	
	/**
	 * a contractor the give the animal a name
	 * @param name
	 */
	public Turtle(String name)
	{
		super(name,start);
		MessageUtility.logConstractor("Turtle", name);
		super.setWeight(1);
		setAge(age);
		super.setDiet(diet);
	}
	
	/**
	 * a contractor the give the animal a name and start point
	 * @param name
	 * @param point
	 */
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


	/**
	 * check if the bear can eat that food 
	 * @param food
	 * 			food type 
	 * @return
	 * 		true if he can eat this food,or false if he dont
	 */
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
		return "[!]" + super.getName() + "\ttotal distance:" + String.format("%.2f", super.getTotaldistance())+ "\tweight:" + this.getWeight();

	}
	
	/**
	 * check if the age of the turtle is legal and update the age,also print the details.
	 * @param age
	 * 			the age of the turtle
	 * @return
	 * 		true if the age is legal else return false
	 */
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
	
	public double getAge()
	{
		MessageUtility.logGetter(this.getName(), "getAge", age);
		return this.age;
	}
}
