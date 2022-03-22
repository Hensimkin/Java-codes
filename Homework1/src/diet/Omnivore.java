package diet;
import animal.Animal;
import food.EFoodType;
import food.IEdible;
public class Omnivore implements IDiet
{
	public boolean canEat(EFoodType food)
	{
		if(food.equals(EFoodType.MEAT)||food.equals(EFoodType.VEGETABLE))
		{
			return true;
		}
		return false;
	}
	
	public double eat(Animal animal, IEdible food)
	{
		return 1;
	}
}
