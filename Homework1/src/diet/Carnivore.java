package diet;

import food.EFoodType;

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
}
