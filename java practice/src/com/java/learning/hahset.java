package com.java.learning;
import java.util.*;

public class hahset 
{

	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();
		//hs.add(null);
		hs.add("six");
		hs.add("one");
		hs.add("three");
		hs.add("ten");
		hs.add("seven");
		hs.add("five");
		hs.add("two");
		hs.add(null);
		Iterator<String>itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		/*HashSet<String> hs2 = new HashSet<String>();
		hs2.add("ten");
		hs2.add("eight");
		hs2.add("four");
		hs2.add(null);
		hs2.addAll(hs);
		System.out.println(hs2);*/
		 System.out.println("_________________________________________________");
			
			HashSet<Integer> hs1 = new HashSet<Integer>();
		     hs1.add(20);
		     hs1.add(25);
		     hs1.add(45);
		     hs1.add(null);
		     hs1.add(45);
		     hs1.add(32);
		     hs1.add(1);
		     hs1.add(8);
		     hs1.add(7);
		     hs1.add(6);
		     hs1.add(11);
		     //hs1.add(null);
		     Iterator<Integer> i = hs1.iterator();
		     while(i.hasNext())
		     {
		    	 System.out.println(i.next());
		     }
			}

		
	}


