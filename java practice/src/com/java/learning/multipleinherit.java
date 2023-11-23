package com.java.learning;

interface Add
{
	void sum();
}

class Calc implements Add
{
	int a = 500 , b = 600 ,c;
	
	public void sub()
	{
		c = a - b;
		System.out.println(c);
	}
	
	public void sum()
	{
		c = a + b;
		System.out.println(c);
	}
	
    public void mul()
    {
    	c = a * b;
    	System.out.println(c);
    }
    
    class Div extends Calc
    {
    	public void division()
    	{
    		c = a / b;
    		System.out.println(c);
    	}
    }
}

class Div extends Calc
{
	public void Division()
	{
		float a = 60 ,b =25 ,c;
	  c = a / b;
	  System.out.println(c);
	}
}
public class multipleinherit 
{

	public static void main(String[] args)
	{
		
		Div d = new Div();
		d.sum();
		d.sub();
		d.mul();// TODO Auto-generated method stub
	    d.Division();
		
	}

}
