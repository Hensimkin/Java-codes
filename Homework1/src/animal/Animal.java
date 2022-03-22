package animal;
import diet.IDiet;
import mobility.Point;
import food.EFoodType;
import food.IEdible;
public abstract class Animal  extends Point implements  IEdible
{
	private String name;
	private double weight=0;
	private IDiet diet;
	
	public Animal(String name,Point point)
	{
		super(point);
		this.name=name;
	}
	
	public abstract void makeSound();
	
	public abstract boolean eat(IEdible food);
	
	public void setWeight(double weight)
	{
		this.weight=weight;
	}


	

}
