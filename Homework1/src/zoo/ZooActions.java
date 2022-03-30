package zoo;

import mobility.*;
import food.*;

import java.util.Scanner;

import animal.*;

public class ZooActions {
	
	public static boolean eat(Object animal, IEdible food)
	{
		if (animal instanceof Lion ||animal instanceof Lion ||animal instanceof Bear||animal instanceof Elephant ||animal instanceof Giraffe ||animal instanceof Turtle )
		{
			if (((Animal) animal).eat(food)==true)
				return true;
		}
		
		return false;
	}
	
	public static boolean move(Object animal, Point point)
	{
		if (animal.getClass().equals(Lion.class)||animal.getClass().equals(Bear.class)||animal.getClass().equals(Elephant.class)||animal.getClass().equals(Giraffe.class)||animal.getClass().equals(Turtle.class))
		{
			if (Point.cheackBounderies(point) ==true)
			{
				double temp=((Animal)animal).getTotaldistance();
				double temp2=((Animal)animal).move(point);
				if(temp!= temp2)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		return false;
	}
	
	
	public static void main(String[] args)
	{
		int size;
		Animal array[];
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a size for the animal array");
		size=scan.nextInt();
		while(size<3)
		{
			System.out.println("Wrong size array must be at least 3");
			size=scan.nextInt();
		}
		array=new Animal[size];
		for(int i=0;i<size;i++)
		{
			int option;
			System.out.println("Please select an animal");
			System.out.println("1. Lion, \n,"1. Lion",\n,);
		}
		
	}

	
}
