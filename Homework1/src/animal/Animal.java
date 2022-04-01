package animal;
import diet.IDiet;
import mobility.*;
import utilities.*;
import food.*;

public abstract class Animal  extends Mobile implements  IEdible
{
	private String name;
	private double weight;
	private IDiet diet;
	
	
	
	
	public Animal(String name,Point point)
	{
		super(point);
		MessageUtility.logConstractor("Animal", name);
		setName(name);
	}
	
	
	
	
	public abstract boolean eat(IEdible food);
	
	
	
	public abstract void makeSound();
	
	
	
	public boolean setWeight(double weight)
	{
		this.weight=weight;
		MessageUtility.logSetter(this.name, "setWeight", this.weight, true);
		return true;
	}
	
	
	
	
	public boolean setDiet(IDiet diet)
	{
		this.diet=diet;
		MessageUtility.logSetter(this.name, "setDiet", this.diet, true);
		return true;
	}
	
	
	
	public String getName()
	{
		return this.name;
	}
	
	
	
	public abstract String toString();
	
	
	
	public IDiet getDiet()
	{
		return this.diet;
	}
	
	
	
	public double getWeight()
	{
		MessageUtility.logGetter(this.name, "getWeight", this.weight);
		return this.weight;
	}
	
	
	
	public boolean setName(String name)
	{
		this.name=name;
		MessageUtility.logSetter(this.name, "setName", this.name, true);
		return true;
	}


	
	
	public double move(Point p)
	{
		double tempWight;
		if(super.calcDistance(p)>0)
		{
			getWeight();
			tempWight=this.weight-(0.00025*this.weight*super.calcDistance(p));
			setWeight(tempWight);
			super.addTotalDistance(calcDistance(p));
			
			return super.getTotaldistance();
		}
		else
		{
			return 0;
		}
	}

}
