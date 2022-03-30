package diet;
import animal.Animal;
import food.EFoodType;
import food.IEdible;
public class Omnivore implements IDiet
{
	private static Carnivore c=new Carnivore();
	private static Herbivore h=new Herbivore();
	
	
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
		if(canEat(food.getFoodtype())==true)
		{
			if(food.getFoodtype()==EFoodType.MEAT) 
			{
				double weight1=c.eat(animal, food);
				return weight1;
			}
			else
			{
				double weight1=h.eat(animal, food);
				return weight1;
			}
				
		}
		else
			return 0;
	}
	
	
	public String toString()
    {
        return "[Omnivore]";
    }
}
