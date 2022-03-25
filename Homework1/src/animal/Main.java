package animal;

import diet.Carnivore;
import food.IEdible;

public class Main 
{
	public static void main(String[] args) 
	{
		IEdible a4=new Lion("simba2");
		Lion a1=new Lion("simba");
		a1.eat(a4);

	}
}
