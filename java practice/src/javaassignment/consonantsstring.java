package javaassignment;

import java.util.Scanner;

public class consonantsstring 
{

	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the string");
		String b =a.next();
		b = b.toLowerCase();
		for(int i=0;i<b.length();i++)
		{
			if(b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u')     
			{}
			else
				System.out.println(" "+b.charAt(i));
		}
		
		
		
	}

}
