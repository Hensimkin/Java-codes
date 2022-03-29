package animal;

import mobility.Point;

public abstract class Chew extends Animal
{

	public Chew(String name, Point point) 
	{
		super(name, point);
	}
	
	
	
	public abstract void chew();
	
	
	
	public void makeSound()
	{
		chew();
	}
}
