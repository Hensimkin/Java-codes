package diet;

import food.EFoodType;

public class Carnivore implements IDiet
{
	public Carnivore()
	{
		
	}
	public boolean  canEat(EFoodType food)
	{
		return true;
	}
}
