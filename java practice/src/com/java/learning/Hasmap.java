package com.java.learning;

import java.util.*;
//import java.util.Set;
public class Hasmap 
{

	public static void main(String[] args)
	{
		/*HashMap<String,Character> f=new HashMap<String ,Character>();
	     f.put("Sam", 'S');
	      //f.put("null", 'n');
	      f.put("Sehan", null);
	      f.put("Geetha",null);
	      //f.put("null", null);
	      f.put("Anitha", 'A');
	      f.put("Ravi", 'R');
	      f.put("Ravi", null);
	      f.put("null",'B');
	      //f.put("null", 'R');
	      f.put("null", 'C');
	      f.put("Anitha",'B');
	      f.put("Arun",'A');
	      f.put("Ganesh",null);
	      f.put("Ganesh",'G');
	      f.put("anitha",'a');
	      //f.put("Ganesh", 'S');
	      
	      for(String a:f.keySet()) 
	      {
	      System.out.println("Name : " + a + " , first letter : " + f.get(a));
	      
		  }*/
		 HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	      hm.put(9, 100);
	      hm.put(95, 101);
	      hm.put(8, 104);
	      hm.put(83, 103);
	      hm.put(80, 104);
	      hm.put(19, 100);
	      hm.put(19, 68);
	      //hm.put(null, null);
	      //hm.put(null, 65);
	      for(int i:hm.keySet())
	      {
	    	  System.out.println("Roll no : " + i + " ,Reg no : " + hm.get(i));
	      }
	      
	     HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
	     // hm1.put(null, 108);
	      hm1.put(1, 105);
	      hm1.put(15, null);
	      hm1.put(12, 103);
	      
	      hm.putAll(hm1);
	      hm1.putIfAbsent(3,180);
	      System.out.println(hm1);
	      hm1.putIfAbsent(4, 181);
	      System.out.println(hm1);
	      hm1.putIfAbsent(11, 185);
	      System.out.println(hm1);
	      hm1.remove(12);
	      System.out.println(hm1);
	      for(int aa:hm.keySet())
	      {
	    	  System.out.println("Roll no : " + aa + " ,Reg no : " + hm.get(aa));
	      }
	}

}
