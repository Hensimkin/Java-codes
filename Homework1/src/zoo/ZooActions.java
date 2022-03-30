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
		String name;
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
			int option=0;
			int option2=0;
			System.out.println("Please select an animal");
			System.out.println("1. Lion \n2. Bear\n3. Elephant\n4. Giraffe\n5. Turtle\n");
			while(option <1||option >5)
			{
				System.out.println("enter the option");
				option=scan.nextInt();
			}
			if (option==1)
			{
				System.out.println("enter name");
				name=scan.next();
				System.out.println("Do you want to choose start point ?\n1. Yes\n2. No");
				while(option2 <1||option2 >2)
				{
					System.out.println("enter the option");
					option2=scan.nextInt();
				}
				if (option2==1)
				{
					array[i]=new Lion(name);
				}
				if (option2==2)
				{
					int x,y;
					Point p = null;
					boolean check=false;
					while(check==false)
					{
						System.out.println("please enter an cordinates 0<=x<=800, 0<=y<=600");
						x=scan.nextInt();
						y=scan.nextInt();
						p=new Point(x,y);
						check =Point.cheackBounderies(p);
					}
					array[i]=new Lion(name,p);
				 }
					
				}
			}
		}
		
	}

	

