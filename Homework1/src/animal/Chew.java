package animal;

import java.awt.Color;

import mobility.Point;

/**
 * a animal that chew after she eat 
 * @author Hen simkin 
 * @author Adir melker
 */
public abstract class Chew extends Animal
{

	public Chew(String name, Point point) 
	{
		super(name, point);
	}
	
	
	public Chew(Point point,int size,Color col,int horSpeed,int verSpeed)
	{
		super(point,size,col,horSpeed,verSpeed);
	}
	
	
	public abstract void chew();
	
	
	
	public void makeSound()
	{
		chew();
	}
}
