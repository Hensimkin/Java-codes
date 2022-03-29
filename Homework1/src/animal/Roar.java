package animal;

import mobility.Point;
import utilities.MessageUtility;

public  abstract class Roar extends Animal
{
	public Roar(String name, Point point) 
	{
		super(name, point);
	}

	public abstract void roar();
	
	public void makeSound()
	{
		roar();
	}
}
