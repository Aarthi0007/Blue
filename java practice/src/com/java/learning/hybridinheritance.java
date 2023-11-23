package com.java.learning;

class Book//F
{
	public void read()
	{
		System.out.println("read the book");
	}
}

class Novel extends Book//S1
{
 	public void read()
	{
	   //super.read();
		System.out.println("reading novel is interesting");
	}
}

class Comics extends Book//S2
{
	public void read()
	{
		super.read();
		System.out.println("children like comics");
	}
}

class Thriller extends Comics //SON OF S2
{
	public void read()
	{
		super.read();
		System.out.println("thriller thrills a lot");
	}
}
	
public class hybridinheritance 
{

	public static void main(String[] args)
	{
	
		Thriller t = new Thriller();
		t.read();
		//t = new Novel();
		//Novel n = new Novel();
		//n.read();
	}

}
