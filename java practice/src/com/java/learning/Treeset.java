package com.java.learning;


import java.util.*;
public class Treeset 
{
	public static void main(String[] args) 
	  {
		 /*TreeSet<String> ts = new TreeSet<String>();
		 ts.add("big");
		 ts.add("bag");
		 ts.add("mug");
		 ts.add("age");
		 ts.add("sip");
		 ts.add("cap");
		 ts.add("nip");
		 ts.add("wig");
		 /*Iterator<String> i = ts.iterator();
		 while(i.hasNext())
		  {  
		    System.out.println(i.next());  
		  }*/
		/*Iterator it1 = ts.descendingIterator();
		 while(it1.hasNext())
		 {
			System.out.println(it1.next()); 
		 }*/
		 
		 TreeSet<Character> ts1 = new TreeSet<Character>();
		 ts1.add('e');
		 ts1.add('c');
		 ts1.add('d');
		 ts1.add('b');
		 ts1.add('r');
		 ts1.add('f');
		 ts1.add('a');
		// ts1.add(null);
		 //ts1.add('n');
		/*Iterator<Character> itr = ts1.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }*/
		 
		 Iterator<Character> itr1 = ts1.descendingIterator();
		 while(itr1.hasNext())
		 {
			 System.out.println(itr1.next());
		 }
		 TreeSet<Character> ts2 = new TreeSet<Character>();
		 ts2.add('m');
		 ts2.add('f');
		 ts2.add('z');
		 ts2.add('q');
		 ts2.add('s');
		 ts2.add('g');
		//ts2.add(null);
		 ts1.addAll(ts2);
		 System.out.println(ts1);
		 ts1.remove('r');
		 System.out.println(ts1);
		 ts2.remove('s');
		 System.out.println(ts2);
		 
		 /*Iterator its = ts2.iterator();
		 while(its.hasNext())
		 {
			 System.out.println(its.next());
		 }*/
		 
		 Iterator it = ts2.descendingIterator();

		 while(it.hasNext())
		 {
	       System.out.println(it.next());
		 }
		 	 
	  }
	}


