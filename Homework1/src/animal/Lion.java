package animal;
import diet.Carnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import diet.IDiet;
import utilities.MessageUtility;

public class Lion extends Animal
{
	private final static Point start=new Point(20,0);
	private final static IDiet diet=new Carnivore();
	private int scarCount=0;
	
	public Lion(String name)//yes
	{
		super(name,start);
		super.setWeight(408.2);
		super.setDiet(diet);
	}
	
	public Lion(String name,Point point)//yes
	{
		super(name,point);
		super.setWeight(408.2);
		super.setDiet(diet);
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
	
	public void roar()//yes
	{
		MessageUtility.logSound(this.getName(), "Roars, then stretches and shakes its mane");
	}
	
	public EFoodType getFoodtype()//yes
	{
		return EFoodType.MEAT;
	}

	public String toString() //no
	{
		return null;
	}
	

	
	



	

}
