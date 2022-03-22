package diet;

import animal.Animal;
import food.EFoodType;
import food.IEdible;

public class Carnivore implements IDiet
{

	public boolean  canEat(EFoodType food)
	{
		if (food.equals(EFoodType.MEAT))
		{
			return true;
		}
		return true;
	}
	
	public double eat(Animal animal, IEdible food)
	{
		return 1;
	}

}
