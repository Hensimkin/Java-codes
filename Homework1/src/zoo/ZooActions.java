package zoo;

import mobility.*;
import food.*;

import java.util.Scanner;

import animal.*;

public class ZooActions {
	
	public static Point pointBuild()
	{
		Scanner scan= new Scanner(System.in);
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
		return p;
	}
	
	
	
	
	
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
			System.out.println("enter name\n");
			name=scan.next();
			while(name.matches(".*\\d.*"))
			{
				name=scan.next();
			}
			System.out.println("Please select an animal\n");
			System.out.println("1. Lion \n2. Bear\n3. Elephant\n4. Giraffe\n5. Turtle\n");
			while(option <1||option >5)
			{
				System.out.println("enter the option\n");
				option=scan.nextInt();
			}
			array[i]=Animalbuild(name,option);
		}
		System.out.println(((Lion)array[0]).getScars());
	}
	
	
	
	public static Animal Animalbuild(String name,int option)
	{
		Scanner scan= new Scanner(System.in);
		int option2=0;
		System.out.println("Do you want to choose start point ?\n1. Yes\n2. No\n");
		while(option2 <1||option2 >2)
		{
			System.out.println("enter the option");
			option2=scan.nextInt();
		}
		if (option2==2)
		{
			
			if (option==1)
			{
				return new Lion(name);
			}
			else if(option==2)
			{
				return new Bear(name);
			}
			else if (option==3)
			{
				return new Elephant(name);
			}
			else if (option==4)
			{
				return new Giraffe(name);
			}
			else
			{
				return new Turtle(name);
			}
			
		}
		else
		{
			if (option==1)
			{
				Point p=pointBuild();
				return new Lion(name,p);
			}
			else if(option==2)
			{
				Point p=pointBuild();
				return new Bear(name,p);
			}
			else if (option==3)
			{
				Point p=pointBuild();
				return new Elephant(name,p);
			}
			else if (option==4)
			{
				Point p=pointBuild();
				return new Giraffe(name,p);
			}
			else
			{
				Point p=pointBuild();
				return new Turtle(name,p);
			}
		}
	}
}		
