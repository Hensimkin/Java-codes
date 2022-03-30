package main;
import animal.*;
public class Main {

	public static void main(String[] args)
	{
		Animal h1=new Lion("Simba");
        Animal h2=new Bear("Baloo");
        Animal h3=new Bear("Baloo2");
        Animal h4=new Elephant("Dumbo");
        /*
        h1.eat(h2);
        h2.eat(h3);
        System.out.println(((Lion)h1).getScars());
        */
        ((Elephant)h4).chew();
	}

}
