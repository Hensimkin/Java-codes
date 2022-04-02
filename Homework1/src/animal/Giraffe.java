package animal;

import diet.Herbivore;
import diet.IDiet;
import food.*;
import mobility.*;
import utilities.MessageUtility;

/**
 * a giraffe type of animal that extend the chew class
 * @author Adir
 *
 */
public class Giraffe extends Chew
{
	private final static Point start=new Point(50,0);
	private final static IDiet diet=new Herbivore();
	private double  neckLength=1.5;
	
	
	/**
	 * a contractor the give the animal a name
	 * @param name
	 */
	public Giraffe(String name)
	{
		super(name,start);
		MessageUtility.logConstractor("Giraffe", name);
		super.setWeight(450);
		setNeckLength(neckLength);
		super.setDiet(diet);
	}
	
	/**
	 * a contractor the give the animal a name and start point
	 * @param name
	 * @param point
	 */
	public Giraffe(String name,Point point)
	{
		super(name,point);
		MessageUtility.logConstractor("Giraffe", name);
		super.setWeight(450);
		setNeckLength(neckLength);
		super.setDiet(diet);
	}


	
	public EFoodType getFoodtype() 
	{
		return EFoodType.MEAT;
	}


	
	public void chew() 
	{
		MessageUtility.logSound(super.getName(),"Bleats and Stomps its legs, then chews");
	}


	/**
	 * check if the elephant can eat that food 
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
	 * check if the length of the neck is legal and update the length,also print the details.
	 * @param lengh
	 * 			the length of the neck
	 * @return
	 * 		true if the length is legal else return false
	 */
	public boolean setNeckLength(double lengh)
	{
		if (lengh>=0.5 && lengh <=3)
		{
			this.neckLength=lengh;
			MessageUtility.logSetter(this.getName(), "setNeckLength", lengh, true);
			return true;
		}
		else
		{
			MessageUtility.logSetter(this.getName(), "setNeckLength", lengh, false);
			return false;
		}
	}
	public double getNeckLength()
	{
		MessageUtility.logGetter(this.getName(), "getNeckLength", neckLength);
		return this.neckLength;
	}
	
	
}
