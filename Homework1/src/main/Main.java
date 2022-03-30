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
        ZooActions.main(args);
        Lion p1=new Lion("simba");
        
        /*
        String nam="abd";
        System.out.println(nam.matches(".*\\d.*"));
        h1.eat(h2);
        h2.eat(h3);
        System.out.println(((Lion)h1).getScars());
        */
        
	}

}
