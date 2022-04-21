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
	
	
	public Chew(String name,Point point,int size,String col,int horSpeed,int verSpeed)
	{
		super(name,point,size,col,horSpeed,verSpeed);
	}
	
	
	public abstract void chew();
	
	
	
	public void makeSound()
	{
		chew();
	}
}
