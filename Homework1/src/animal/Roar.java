package animal;

import mobility.Point;
import utilities.MessageUtility;

public  abstract class Roar extends Animal
{
	public Roar(String name, Point point) 
	{
		super(name, point);
	}

	public void roar()
	{
		if (this.getClass()==Lion.class)
		{
			MessageUtility.logSound(super.getName(),"Roars, then stretches and shakes its mane");
		}
		/*
		if (this.getClass()==Bear.class)
		{
			MessageUtility.logSound(super.getName(),"Stands on its hind legs, roars and scratches its belly");
		}
		*/
	}
	
	public void makeSound()
	{
		roar();
	}
}
