package com.java.learning;

public class variable {
	static int sum = 568;
	int mark = 100;
	public void m1()
	{
		int a = 23;
		System.out.println(mark);
		System.out.println(sum);
		System.out.println(a);
	}
	public static void m2()
	{
		int b = 89;
		variable r = new variable();//reference variable
		System.out.println(sum);
		System.out.println(r.mark);
		System.out.println(b);
	}
	variable()
	{
		System.out.println("i am a constructor");
	}
	
 public static void main(String[] args) 
 {
	 variable v = new variable();
	int var = 67;
	System.out.println(sum);
	System.out.println(v.mark);
	System.out.println(var);
	v.m1();
	m2();
	
 }

}
