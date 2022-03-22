package animal;
import diet.Carnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import diet.IDiet;

public class Lion extends Animal
{
	private final static Point start=new Point(20,0);
	private final static IDiet Meat=new Carnivore();
	private int scarCount=0;
	
	public Lion(String name)
	{
		super(name,start);
		super.setWeight(408.2);
		
	}
	
	public boolean eat(IEdible food)
	{
		return true;
	}
	
	public void makeSound()
	{
		
	}
	
	public EFoodType getFoodtype()
	{
		
	}

	
	



	

}
