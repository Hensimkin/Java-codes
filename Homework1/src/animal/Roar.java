package animal;

import mobility.Point;

/**
 * a animal that roar after she eat 
* @author Hen simkin 
 * @author Adir melker
 */
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
