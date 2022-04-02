package diet;
import animal.Animal;
import food.EFoodType;
import food.IEdible;
/**
 * a class the that represent a Herbivore and impements IDiet
 * @author Adir
 *
 */
public class Herbivore implements IDiet
{
	/**
	 * function that check if he can eat this type of food
	 * @param food
	 * 			type of food
	 * @return
	 * 		if he can eat this type of food he return true else false
	 */
	public boolean  canEat(EFoodType food)
	{
		if (food.equals(EFoodType.VEGETABLE))
		{
			return true;
		}
		return false;
	}
	/**
	 * function that first check if he can eat this type of food and if he can she increase is weight
	 * @param animal			
	 * 			what type of animal
	 * @param food
	 * 			what type of food
	 * @return 
	 * 		return is update weight if he can eat,else return 0;
	 */
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
