package com.java.learning;

public class constructor {
	int a = 13 , b= 78;
	public void m1()
	{
		int a = 98 , b= 89,d;
		d =  a + b;
		System.out.println(d);
		int c;
		c = this.a + this.b;
		System.out.println(c);
	}
	
	constructor()
	{
		System.out.println("hi");
	}
	

	public static void main(String[] args) 
	{
		constructor c = new constructor();
		c.m1();

	}

}
