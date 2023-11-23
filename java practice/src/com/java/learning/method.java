package com.java.learning;

public class method {
	
	int a = 13 ,b =34 ,c;

	public void m1()

	{
        c = a + b;
        System.out.println(c);

	}
   public void m2()

	{

		//int a =78 ,b = 87,c;

		c = a - b;

		System.out.println(c);

	}

	public void m1(int a , int b)

	{

		int c;

		c = a + b;

		System.out.println(c);

	}

  public static void main(String[] args) 

  {

	method m = new method();

	m.m1();

	m.m1();

	m.m2();

	m.m1(56, 90);

  }

}	

	
