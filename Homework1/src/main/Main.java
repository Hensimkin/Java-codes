
package main;
import mobility.*;
import java.util.InputMismatchException;
import animal.*;
import plants.*;
import zoo.*;


public class Main
 {


	public static void main(String[] args)
	{

		Point p=new Point(4,50);
		Lion k=new Lion("simba");
		System.out.println(k);
		k.move(p);
		System.out.println(k);
		
	}

}