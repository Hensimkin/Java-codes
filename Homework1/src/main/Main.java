package main;
import animal.*;
public class Main {

	public static void main(String[] args)
	{
		Animal h1=new Lion("Simba");
        System.out.println(((Lion) h1).getScars());
	}

}
