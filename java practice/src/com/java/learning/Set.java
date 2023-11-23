package com.java.learning;

import java.util.*;
public class Set
{

	public static void main(String args[])
	{   
	  HashSet<String> set = new HashSet<String>();  
	  set.add("red");  
	  set.add("blue");  
	  set.add("green"); 
	  set.add("blue"); 
	  set.add("Red");
	  Iterator<String> itr=set.iterator();  
	  while(itr.hasNext())
	  {  
	    System.out.println(itr.next());  
	  } 
	  HashSet<String> set1 = new HashSet<String>();
	  set1.add("grapes");
	  set1.add("apple");
	  set1.add("banana");
	  set1.add("guava");
	  set1.add("mango");
	  set1.add("jackfruit");
	  set1.add("banana");
	  set1.add("vijay");
	  set1.add(null);
	  set.add(null);
	  set1.add(null);
	  set.addAll(set1);
	  
	  System.out.println(set);
	  System.out.println(set1);
	  System.out.println("new list is: " + set1 + set);
	  System.out.println("new list is:" + set);
	  System.out.println("new list is: " + set1);
	 }  

}
