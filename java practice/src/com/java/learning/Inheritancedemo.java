package com.java.learning;

class Vehicle
{
	protected String brand = "TVS";
	public void sound()
	{
		System.out.println("vrrrr");
	}
 }
public class Inheritancedemo 
{

	public static void main(String[] args)
	
		{
		      Bike b1 = new Bike();
			  b1.sound();
			  System.out.println(b1.brand + " " + b1.modelname);
		  }

	}

class Bike extends Vehicle
{
	//private String modelname = "WEGO";
	 String modelname = "WEGO";
}


