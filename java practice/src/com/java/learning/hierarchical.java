package com.java.learning;

class Seasons //F
{
	public void temperature()
	{
		System.out.println("temperature differs");
	}
}

class Spring extends Seasons //S1
{
	public void condition()
	{
		System.out.println("spring the leaves and flowers grow again");
	}
}

class Autumn extends Seasons //S2
{
	public void condition()
	{
		System.out.println("autumn the leaves and flowers fall");
	}
	
}

class Summer extends Seasons //S3
{
	public void condition()
	{
		super.temperature();
		System.out.println("summer climate is very hot");
	}
}

class Winter extends Seasons //S4
{
	public void condition()
	{
		//super.temperature();
		System.out.println("winter climate is cold");
	}
}
public class hierarchical
{

	public static void main(String[] args)
	{
		Spring sp = new Spring();
		Autumn an = new Autumn();
		Summer s = new Summer();
		Winter w = new Winter();
		//sp.temperature();
		sp.condition();
		//an.temperature();
		an.condition();
		//s.temperature();
		s.condition();
		//w.temperature();
		w.condition();

	}

}
