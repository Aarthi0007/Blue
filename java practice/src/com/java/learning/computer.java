package com.java.learning;



abstract class Work // abstract class
{
	abstract void keypress(); // abstract method has no body
	public void actions()
	{
		System.out.println("perform some action");
	}
}
class Control extends Work
{
	public void keypress()
	{
		System.out.println("copy the line");
	}
}
class Alter extends Work
{
	public void keypress()
	{
		System.out.println("move the tab");
	}

}

public class computer
{

	public static void main(String[] args)
	{
		Control c = new Control();
		Alter a = new Alter();
		c.keypress();c.actions();
		a.keypress();a.actions();


	}

}
