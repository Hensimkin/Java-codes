package animal;
import java.util.Random;

import diet.Herbivore;
import diet.IDiet;
import diet.Omnivore;
import mobility.*;
import utilities.MessageUtility;
import food.EFoodType;
import food.IEdible;
public class Elephant extends Chew
{
	private final static Point start=new Point(100,5);
	private final static IDiet diet=new Herbivore();
	double trunkLengh;
	
	
	public Elephant(String name)
	{
		super(name,start);
		MessageUtility.logConstractor("Elephant", name);
		super.setWeight(500);
		super.setDiet(diet);
	}
	
	
	public Elephant(String name,Point point)
	{
		super(name,point);
		MessageUtility.logConstractor("Elephant", name);
		super.setWeight(500);
		super.setDiet(diet);
	}


	
	public EFoodType getFoodtype() {
		return EFoodType.MEAT;
	}


	@Override
	public void chew() {
		MessageUtility.logSound(super.getName(),"Trumpets with joy while flapping its ears, then chews");
		
	}


	@Override
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


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
