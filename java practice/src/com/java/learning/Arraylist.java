package com.java.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Arraylist 
{
	 public static void main(String[] args)
		{
		 ArrayList<Integer> al = new ArrayList<>();
		 al.add(98);
		 al.add(23);
		 al.add(67);
		 al.add(23);
		 al.add(78);
		 al.add(10);
		al.add(null);
		 al.add(67);
		 al.add(null);
		 al.add(45);
		 System.out.println(al);
		 al.set(2, 89);
		 System.out.println(al);
		 System.out.println(al.get(4));
		 System.out.println(al.size());
		 /*al.remove(6);
		 System.out.println(al);
		 /*al.clear();
		 System.out.println(al);
		 /*Collections.sort(al);
		 System.out.println(al);*/
		/* Iterator<Integer> itr = al.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }*/
		 
		 ArrayList<Integer> al1 = new ArrayList<>();
		 al1.add(54);
		 al1.add(99);
		 al1.add(99);
		 System.out.println(al1);
		 al.addAll(al1);
		 System.out.println(al);
		 

		}


}
