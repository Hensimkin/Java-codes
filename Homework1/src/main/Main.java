package main;
import animal.*;
import plants.*;
public class Main {

	public static void main(String[] args)
	{
		Plant h8=new Cabbage();
		Animal h1=new Lion("Simba");
        Animal h2=new Bear("Baloo");
        Animal h3=new Bear("Baloo2");
        Animal h4=new Elephant("Dumbo");
        Animal h5=new Giraffe("Melman");
        Animal h6=new Turtle("Refael");
        h6.eat(h8);
        /*
        h1.eat(h2);
        h2.eat(h3);
        System.out.println(((Lion)h1).getScars());
        */
        
	}

}
