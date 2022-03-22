package animal;
import diet.IDiet;
import mobility.Point;
import food.IEdible;
public abstract class Animal  extends Point implements  IEdible
{
	private String name;
	private double  weight=0;
	private IDiet diet;
	
	public Animal(String name,Point point)
	{
		super(point);
		this.name=name;
	}
	
	public abstract void makeSound();
	
	public abstract boolean eat(IEdible food);
	
	public boolean setWeight(double weight)
	{
		this.weight=weight;
		return true;
	}
	
	public boolean setDiet(IDiet diet)
	{
		this.diet=diet;
		return true;
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	public abstract String toString();

	

}
