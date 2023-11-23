package com.java.learning;
class Species
{
	protected String name = "snake";
	public void type()
	{
		System.out.println("venomous");
	}
}

class Cobra extends Species
{
	String breedname = "king cobra";}

public class inheritance
{
	public static void main(String[] args) 
	  {
			Cobra c = new Cobra();
			c.type();
			System.out.println(c.name + " " + c.breedname);

		}
}
