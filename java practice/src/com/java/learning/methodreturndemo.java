package com.java.learning;

public class methodreturndemo 
{	
	public void add()
	{
		int a = 65, b = 55,c;
		c = a + b;
		System.out.println(c);
	}
	public int add(int a ,int b)
	{
		int c;
		c = a + b;
		System.out.println("adding two numbers="+c);
		return c;
	}
	
	
	public void sub()
	{
		int a = 65, b = 55,c;
		c = a - b;
		System.out.println(c);
	}
	public int sub(int a ,int b)
	{
		int c;
		c = a - b;
		System.out.println("sub two numbers="+c);
		return c;
	}
	public void multi()
	{
		int a = 90, b = 55,c;
		c = a * b;
		System.out.println(c);
	}
	public int multi(int a ,int b)
	{
		int c;
		c = a + b;
		System.out.println("multi two numbers="+c);
		return c;
	}
	public void division()
	{
		float a = 90, b = 55,c;
		c = a / b;
		System.out.println(c);
	}
	public float division(float a ,float b)
	{
		float c;
		c = a / b;
		System.out.println("division two numbers="+c);
		return c;
	}
  public static void main(String[] args)
  {
	methodreturndemo m = new methodreturndemo();
	m.add();
	m.sub();
	m.multi();
	m.division();
	int add = m.add(856, 450);
	int sub = m.sub(456,265);
	int multi =m.multi(567,789);
	float division =m.division(456,234);
	System.out.println(add);
	System.out.println(sub);
	System.out.println(multi);
	System.out.println(division);
   }
}





