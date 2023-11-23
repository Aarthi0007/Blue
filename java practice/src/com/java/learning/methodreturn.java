package com.java.learning;

public class methodreturn {

	
	public void m1()
	{
		int a = 34, b = 98,c;
		c = a + b;
		System.out.println(c);
	}
	public int m1(int a ,int b)
	{
		int c;
		c = a + b;
		System.out.println("adding two numbers");
		return c;
		
	}
  public static void main(String[] args)
  {
	methodreturn m = new methodreturn();
	m.m1();
	int m1 = m.m1(345, 543);
	System.out.println(m1);
   }
}



