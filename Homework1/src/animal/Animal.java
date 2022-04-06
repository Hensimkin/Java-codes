package animal;
import diet.*;
import food.*;
import mobility.*;
import utilities.*;
import graphics.*;

/**
 * class that represent an animal
 * @author Hen simkin 
 * @author Adir melker
 */
public abstract class Animal  extends Mobile implements  IEdible, IDrawable,IAnimalBehavior
{
	private String name;
	private double weight;
	private IDiet diet;
	private final int EAT_DISTANCE = 5;
	private int size;
	//private Color col;
	private int horSpeed;
	private int verSpeed;
	private boolean coordChanged;
	private Thread thread;
	private int x_dir;
	private int y_dir;
	private int eatCount;
	//private ZooPanel pan;
	//private BufferedImage img1, img2;
	
	
	
	/**
	 * constractor that get name and point
	 * @param name
	 * 			the name of the animal
	 * @param point
	 * 			starting point of the animal
	 */
	public Animal(String name,Point point)
	{
		super(point);
		MessageUtility.logConstractor("Animal", name);
		setName(name);
	}
	
	
	
	
	public abstract boolean eat(IEdible food);
	
	
	
	public abstract void makeSound();
	
	
	/**
	 *	set the weight of the animal 
	 * @param weight
	 * @return
	 */
	public boolean setWeight(double weight)
	{
		this.weight=weight;
		MessageUtility.logSetter(this.name, "setWeight", this.weight, true);
		return true;
	}
	
	
	
	/**
	 * set the diet of the animal
	 * @param diet
	 * @return
	 */
	public boolean setDiet(IDiet diet)
	{
		this.diet=diet;
		MessageUtility.logSetter(this.name, "setDiet", this.diet, true);
		return true;
	}
	
	
	/**
	 * return the name of the animal
	 * @return
	 */
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


	
	/**
	 *	function that decrease the weight of the animal depend the total the distance he walk
	 *	and update is new location 
	 * @param p	
	 * 		the point the animal walk
	 * @return
	 * 		the total distance
	 */
	public double move(Point p)
	{
		double tempWight;
		if(super.calcDistance(p)>0)
		{
			tempWight=this.weight-(0.00025*this.weight*super.calcDistance(p));
			setWeight(tempWight);
			super.addTotalDistance(calcDistance(p));
			super.setLocation(p);
			return super.getTotaldistance();
			
		}
		else
		{
			return 0;
		}
	}

}
