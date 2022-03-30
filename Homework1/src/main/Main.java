package main;
import mobility.*;
import animal.*;
import plants.*;
import zoo.*;

public class Main {

	public static void main(String[] args)
	{
		Point z=new Point(40,30);
		Plant h8=new Cabbage();
		Animal h1=new Lion("Simba");
        Animal h2=new Bear("Baloo");
        Animal h3=new Bear("Baloo2");
        Animal h4=new Elephant("Dumbo");
        Animal h5=new Giraffe("Melman");
        Animal h6=new Turtle("Refael");
        System.out.println(h6.move(z));
        ZooActions za1=new ZooActions();
        za1.eat(h1,h3);
        /*
        h1.eat(h2);
        h2.eat(h3);
        System.out.println(((Lion)h1).getScars());
        */
        
	}

}
