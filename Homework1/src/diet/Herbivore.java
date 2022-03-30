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
		if(canEat(food.getFoodtype())==true)
		{
			double tempweight=animal.getWeight()+animal.getWeight()*0.07;
			return tempweight;
		}
		else
		{
			return 0;
		}
	}
	
	public String toString()
    {
        return "[Herbivore]";
    }
}
