package diet;
import food.EFoodType;
public class Omnivore implements IDiet
{
	public boolean canEat(EFoodType food)
	{
		if(food==EFoodType.MEAT |food==EFoodType.VEGETABLE)
		{
			return true;
		}
		return false
	}
}
