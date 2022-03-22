package diet;
import food.EFoodType;
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
}
