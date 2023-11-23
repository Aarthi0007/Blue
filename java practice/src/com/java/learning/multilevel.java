package com.java.learning;

class Shape
{
	public void draw()
	{
		System.out.println("different shapes in different pattern");
	}
}

class Rectangle extends Shape//GF
{
	public void area()
	{
		System.out.println("inside area");
	}
}

class Cube extends Rectangle//F
{
	public void volume()
	{
		System.out.println("inside volume");
	}
}

class Circle extends Cube//S
{
	public void surfacearea()
	{
		System.out.println("area of circle");
	}
}

class Triangle extends Circle //GC
{
	public void circumferance()
	{
		System.out.println("area of circumferance");
	}
}

class Cone extends Triangle//GGC
{
	public void radius()
	{
		super.draw();
		System.out.println("radius of cone");
	}
}
public class multilevel
{

	
	public static void main(String[] args)
	{
		
			 Cone c = new Cone();
			 c.area();
			 // c.area();
			 c.circumferance();
			 //c.draw();
			 c.radius();
			 c.surfacearea();                          

			
	}

}
