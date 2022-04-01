package zoo;
import mobility.*;
import food.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import animal.*;

public class ZooActions {
	
	public static Point pointBuild()
	{
		Scanner scan= new Scanner(System.in);
		int x=0,y=0;
		Point p = null;
		boolean done=false;
		while(!done)
		{
			try
			{
				System.out.println("Enter x");
				x=scan.nextInt();
				System.out.println("Enter y");
				y=scan.nextInt();
				p=new Point(x,y);
				done=true;
			}
			catch(InputMismatchException e)
			{
				String str=scan.nextLine();
				System.out.println("ivaild numbers");
			}
		}
		done=false;
		while(Point.cheackBounderies(p)==false)
		{
			while(!done)
			{
				try
				{
					System.out.println("Enter x");
					x=scan.nextInt();
					System.out.println("Enter y");
					y=scan.nextInt();
					p=new Point(x,y);
					done=true;
				}
				catch(InputMismatchException e)
				{
					String str=scan.nextLine();
					System.out.println("ivaild numbers");
				}
			}
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
		int op1,op2;
		Random check=new Random();
		Random check2=new Random();
		int size=0;
		int size2=0;
		int temp;
		String name;
		Animal array[];
		Scanner scan= new Scanner(System.in);
		boolean done=false;
		while(!done)
		{
			try
			{
				while(size<3)
				{
					System.out.println("enter number above 3");
					size=scan.nextInt();
				}
				done=true;
			}
			catch(InputMismatchException e)
			{
				String str=scan.nextLine();
				System.out.println("ivaild");
			}
		}
		array=new Animal[size];
		for(int i=0;i<size;i++)
		{
			int option=0;
			System.out.println("enter name\n");
			name=scan.next();
			while(name.matches(".*\\d.*"))
			{
				name=scan.next();
			}
			System.out.println("Please select an animal\n");
			System.out.println("1. Lion \n2. Bear\n3. Elephant\n4. Giraffe\n5. Turtle\n");
			done=false;
			while(!done)
			{
				try
				{
					while(option <1||option >5)
					{
						System.out.println("enter the option\n");
						option=scan.nextInt();
					}
					done=true;
				}
				catch(InputMismatchException e)
				{
					String str=scan.nextLine();
					System.out.println("ivaild choice");
				}
			}
			array[i]=Animalbuild(name,option);
		}
		
		
		System.out.println("******Movment simulation******");
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the point");
			if(move(array[i],pointBuild())==true)
			{
				System.out.println("The animal has moved:  ");
				System.out.print(array[i].getTotaldistance());
				System.out.println("\n");
			}
		
		}
		if(size%2==0)
			temp=size/2;
		else
		{
			temp=(size-1)/2;
		}
		System.out.println("******Eating simulation******");
		for(int i=0;i<temp;i++)
		{
			op1=check.nextInt(size);
			op2=check2.nextInt(size);
			boolean t=eat(array[op1],array[op2]);
			if(t==true)
			{
				System.out.println("The animal ate ");
			}
			else
			{
				System.out.println("The animal didnt ate ");
			}
		}
	}
	
	
	
	public static Animal Animalbuild(String name,int option)
	{
		Scanner scan= new Scanner(System.in);
		int option2=0;
		System.out.println("Do you want to choose start point ?\n1. Yes\n2. No\n");
		boolean done=false;
		while(!done)
		{
			try
			{
				while(option2 <1||option2 >2)
				{
					System.out.println("enter the option");
					option2=scan.nextInt();
				}
				done=true;
			}
			catch(InputMismatchException e)
			{
				String str=scan.nextLine();
				System.out.println("ivaild choice");
			}
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
