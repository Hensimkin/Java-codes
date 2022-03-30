package zoo;

import food.*;
import animal.*;

public class ZooActions {
	
	public static boolean eat(Object animal, IEdible food)
	{
		if (animal.getClass().equals(Lion.class)||animal.getClass().equals(Bear.class)||animal.getClass().equals(Elephant.class)||animal.getClass().equals(Giraffe.class)||animal.getClass().equals(Turtle.class))
		{
			if (((Animal) animal).eat(food)==true)
				return true;
		}
		
		return false;
	}
}
