package com.java.learning;

interface Birds//interface
{
	void birdcolor();
    void birdsound();
}
class Parrot implements Birds
{
	public void birdcolor()
	{
		System.out.println("parrot is green in color");
	}
	public void birdsound()
	{
		System.out.println("parrot says KIKI");
	}
}

class Crow implements Birds
{
	public void birdcolor()
	{
		System.out.println("crow is black in color");
	}
	public void birdsound()
	{
		System.out.println("crow says KAWKAW");
	}
}

public class bird 
{

	public static void main(String[] args)
	{
     
		Parrot p = new Parrot();
		Crow c = new Crow();
		p.birdcolor();p.birdsound();
		c.birdcolor();c.birdsound();
	}

}
