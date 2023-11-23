package com.java.learning;

class Parent
{
	void print()
	{
		System.out.println("print parent method");
	}
}
class Child1 extends Parent
{
	void print()
	{
		System.out.println("print child1 method");
	}
}

class Child2 extends Parent
{
	void print()
	{
		System.out.println("print child2 method");
	}
}
public class methodoverriding {
	 public static void main(String[] args) 
	  {
		Parent p = new Parent();
		p.print();
		p = new Child1();
		p.print();
		p = new Child2();
		p.print();
	  }
}
