package animal;
import diet.IDiet;
public abstract class Animal 
{
	private String name;
	private double  weight;
	private IDiet diet;
	
	public Animal();
	
	public void makeSound();
	
	boolean eat(IEdible food)

	

}
