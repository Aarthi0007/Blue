package javaassignment;

import java.util.Scanner;

public class cube 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side length of the cube");
		Float a= sc.nextFloat();
		a=6*a*a;
		System.out.println("The surface area of the cube= " +a);

	}

}
