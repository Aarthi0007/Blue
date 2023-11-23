package com.java.learning;

public class methodoverloading 
 {
	static int add(int a , int b)
	{
		return a + b;
	}
	static int add(int a , int b ,int c)
	{
		return a+ b + c;
	}

	  public static void main(String[] args) 
	  {
		System.out.println("adding two varibles");
		System.out.println(add(345, 988));
		System.out.println("adding three variables");
		System.out.println(add(8766,7654,2235));
		
	}
}
