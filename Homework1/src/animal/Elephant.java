package animal;

import diet.Herbivore;
import diet.IDiet;
import mobility.*;
import utilities.MessageUtility;
import food.*;

public class Elephant extends Chew
{
	private final static Point start=new Point(50,90);
	private final static IDiet diet=new Herbivore();
	private double trunkLengh=1;
	
	
	public Elephant(String name)
	{
		super(name,start);
		MessageUtility.logConstractor("Elephant", name);
		super.setWeight(500);
		setTrunkLengh(trunkLengh);
		super.setDiet(diet);
	}
	
	
	public Elephant(String name,Point point)
	{
		super(name,point);
		MessageUtility.logConstractor("Elephant", name);
		super.setWeight(500);
		setTrunkLengh(trunkLengh);
		super.setDiet(diet);
	}


	
	public EFoodType getFoodtype() 
	{
		return EFoodType.MEAT;
	}


	
	public void chew() 
	{
		MessageUtility.logSound(super.getName(),"Trumpets with joy while flapping its ears, then chews");
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
	
	
	public boolean setTrunkLengh(double lengh)
	{
		if (lengh>=0.5 && lengh <=3)
		{
			this.trunkLengh=lengh;
			MessageUtility.logSetter(this.getName(), "setTrunkLengh", lengh, true);
			return true;
		}
		else
		{
			MessageUtility.logSetter(this.getName(), "setTrunkLengh", lengh, false);
			return false;
		}
	}
}
