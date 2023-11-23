package com.java.learning;
import java.util.Set;
import java.util.TreeMap;
import java.util.*;

public class Treemap 
{
	 public static void main(String[] args) 
	  {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		 tm.put(16, "yuresha");
		 tm.put(5, "Yashika");
		 tm.put(10, "usha");
		 tm.put(20, "kanika");
		 tm.put(15, "varsha");
		 //tm.put(null, "sweety");
		 tm.put(1, "zaira");
		 tm.put(11, "vanitha");
		 tm.put(2, "anitha");
		tm.put(1, "Bindu");
		tm.put(0, "yasin");
		
		
		Set set = tm.entrySet();
		 Iterator itr = set.iterator();
		 while(itr.hasNext())
		 {
			 Map.Entry me = (Map.Entry)itr.next();
			 System.out.println("key is: " + me.getKey() + " value is: " + me.getValue());
			 //System.out.println(me.getValue());
		 }
		 
	    /* TreeMap<Character,String> tm1 = new TreeMap<Character,String>();
		 tm1.put('R', "Red");
		//tm1.put(null, "null");
		 tm1.put('G', "Green");
		 tm1.put('V', "Violet");
		 tm1.put('W',"White");
		 tm1.put('Y', null);
		 tm1.put('y', "yellow");
		 
		 Set set1 = tm1.entrySet();
		 
		 Iterator itr1 = set1.iterator();
		 while(itr1.hasNext())
		 {
			 Map.Entry me = (Map.Entry)itr1.next();
			 System.out.println("First letter is : " + me.getKey() + " color is: " + me.getValue());
		 }
		 
		 TreeMap<Character,String> tm2 = new TreeMap<Character,String>();
		 tm2.put('B', "blue");
		 tm2.put('b', "black");
		 tm2.put('Y', "yellow");
		 tm2.put('O', "orange");
		 tm2.put('P', "purple");
		 tm2.put('I', "indigo");
		 tm1.putAll(tm2);
		 
		 System.out.println(tm1.size());
		 
		 System.out.println(tm2.size());
		 
		 tm1.replace('W',"White" ,"Water");
		 System.out.println(tm1);
		 
		tm1.replaceAll((k , v)->"blue");
		 System.out.println(tm1);
		 
		 tm2.clear();
		 System.out.println(tm2);
		
		 Set setr = tm1.entrySet();
		 
		 Iterator itrr = setr.iterator();
		 while(itrr.hasNext())
		 {
			 Map.Entry me = (Map.Entry)itrr.next();
			 System.out.println("First letter is : " + me.getKey() + " color is: " + me.getValue());
		 }
		 
		/* Set set2 = tm2.entrySet();
		 
		 Iterator itr2 = set.iterator();
		 while(itr2.hasNext())
		 {
			 Map.Entry me = (Map.Entry)itr2.next();
			 System.out.println("First letter: " + me.getKey() + " color is: " + me.getValue());
		 }*/
		 
	   }
}
