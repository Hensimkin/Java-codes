package animal;

import java.awt.Color;

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
	
	
	public Roar(Point point,int size,String col,int horSpeed,int verSpeed) 
	{
		super(point,size,col,horSpeed,verSpeed);
	}

	public abstract void roar();
	
	public void makeSound()
	{
		roar();
	}
}
