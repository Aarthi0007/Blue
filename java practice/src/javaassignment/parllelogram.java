package javaassignment;

import java.util.Scanner;

public class parllelogram 
{

	public static void main(String[] args) 
	{
		Float b,h,area;
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the base and height of the parallelogram");
		b=c.nextFloat();
		h=c.nextFloat();
		area = b*h;
		System.out.println("Area of the parallelogram= " +area);
	}

}
