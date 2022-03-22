package diet;
import food.EFoodType;
public class Omnivore implements IDiet
{
	public boolean canEat(EFoodType food)
	{
		if(food.equals(EFoodType.MEAT)|food.equals(EFoodType.VEGETABLE))
		{
			return true;
		}
		return false;
	}
}
