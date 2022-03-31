package diet;

import food.*;
import animal.Animal;

public interface IDiet 
{
	public boolean canEat(EFoodType food);
	public double eat(Animal animal, IEdible food);
}
