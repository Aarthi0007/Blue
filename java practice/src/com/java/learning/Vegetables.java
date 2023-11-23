package com.java.learning;



	class Vegetable
	{
		public void vegetabletaste()
		{
			System.out.println("vegetable taste differs");
		}
	}

	class Lemon extends Vegetable
	{
		public void vegetabletaste()
		{
			System.out.println("lemon is sour taste");
		}
	}

	class Carrot extends Vegetable
	{
		public void vegetabletaste()
		{
			System.out.println("carrot is sweet taste");
		}
	}

	class Bitterguard extends Vegetable
	{
		public void vegetabletaste()
		{
			System.out.println("bitterguard is bitter in taste");
		}
	}
		public class Vegetables //polymorphism 
		{
		  public static void main(String[] args) 
		  {
			Vegetable v = new Vegetable();
			Lemon l = new Lemon();
			Bitterguard b =  new Bitterguard();
			Carrot c = new Carrot();
			v.vegetabletaste();c.vegetabletaste();
			l.vegetabletaste();b.vegetabletaste();
	}

		} 
		
	
