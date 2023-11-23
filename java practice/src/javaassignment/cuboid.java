package javaassignment;

import java.util.Scanner;

public class cuboid
{

	public static void main(String[] args)
	{
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the cuboid:");
    int length =sc.nextInt();
    System.out.println("Enter the breadth of the cuboid:");
    int breadth =sc.nextInt();
    System.out.println("Enter the height of the cuboid:");
    int height =sc.nextInt();
	int surface_area=2*((length*breadth)+(breadth*height)+(height*length));
	System.out.println("The surface area of the cuboid is:"+surface_area);
	int volume =length*breadth*height;
	System.out.println("The volume of the cuboid is:"+volume);
	}

}
