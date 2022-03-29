package animal;

import diet.Carnivore;
import food.IEdible;
import mobility.*;


public class Main 
{
	public static void main(String[] args) 
	{
		Point p=new Point(4,4);
		Animal a1=new Lion("simba");
        a1.eat(a1);
       
	}
}
