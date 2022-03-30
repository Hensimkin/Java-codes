package zoo;

import mobility.*;
import food.*;
import animal.*;

public class ZooActions {
	
	public static boolean eat(Object animal, IEdible food)
	{
		if (animal instanceof Lion ||animal instanceof Lion ||animal instanceof Bear||animal instanceof Elephant ||animal instanceof Giraffe ||animal instanceof Turtle )
		{
			if (((Animal) animal).eat(food)==true)
				return true;
		}
		
		return false;
	}
	
	public static boolean move(Object animal, Point point)
	{
		if (animal.getClass().equals(Lion.class)||animal.getClass().equals(Bear.class)||animal.getClass().equals(Elephant.class)||animal.getClass().equals(Giraffe.class)||animal.getClass().equals(Turtle.class))
		{
			if (Point.cheackBounderies(point) ==true)
			{
				double temp=((Animal)animal).
				((Animal)animal).
			}
		}
	}

	
}
