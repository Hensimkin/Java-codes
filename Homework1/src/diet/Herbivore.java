package diet;
import animal.Animal;
import food.EFoodType;
import food.IEdible;
public class Herbivore implements IDiet
{
	public boolean  canEat(EFoodType food)
	{
		if (food.equals(EFoodType.VEGETABLE))
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
