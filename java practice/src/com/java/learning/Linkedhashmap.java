package com.java.learning;

import java.util.*;
import java.util.Set;
import java.util.Map;
public class Linkedhashmap
{
	  public static void main(String[] args)
	  {
	     /*LinkedHashMap<String,String> s = new LinkedHashMap<String,String>();
	         s.put("Arun","Raj");
	         s.put(null, "Vignesh");
	         s.put("Sita", "null");
	         s.put("Raj","kumar");
	         s.put("Anita", "null");
	         s.put("Ram", "Priya");
	         //s.put(null, "nathan");
	         s.put(null, null);
	         
	         for(String d:s.keySet())
	         {
	      	   System.out.println("FirstName : "+ d + " LastName : "+s.get(d));
	         }
	        
	         LinkedHashMap<String,String> lh = new LinkedHashMap<String,String>();
	         lh.put("lick", "sick");
	         lh.put("brick", "bike");
	         lh.put("hack", "hike");
	         lh.put("sake", "make");
	         lh.put("bake", "nike");
	         s.putAll(lh);
	         lh.putIfAbsent("blank", "blink");
	         lh.putIfAbsent("lack", "black");
	         System.out.println(lh);
	         
	         for(String c:lh.keySet())
	         {
	      	   System.out.println("First name : "+ c + " Rhyming name : "+lh.get(c));
	         }*/
	         
	        LinkedHashMap<Integer,Integer> lh1 = new LinkedHashMap<Integer,Integer>();
	         lh1.put(12, 160);
	         lh1.put(16, 356);
	         lh1.put(52, 596);
	         lh1.put(98, 856);
	         lh1.put(65, 235);
	         lh1.put(63, 235);
	         /*System.out.println("linked hash map :" + lh1);
	         System.out.println("key-value mappings:"+ lh1.entrySet());
	         System.out.println("keys: " + lh1.keySet());
	         System.out.println("values:" + lh1.values());*/
	         
	         LinkedHashMap<Integer,Integer> lh2 = new LinkedHashMap<Integer,Integer>();
	         lh2.put(18, null);
	         lh2.put(2, 258);
	         lh2.put(7, 874);
	         lh2.put(56, 458);
	         lh2.put(20, 578);
	         lh2.put(null, 20);
	        /* LinkedHashMap<Integer,Integer> lh3 = new LinkedHashMap<Integer,Integer>();
	         
	         lh3.put(18, null);
	         lh3.put(2, 258);
	         lh3.put(7, 874);
	         lh3.put(56, 458);
	         lh3.put(20, 578);
	         lh3.put(null, 20);*/
	         
	         
	         lh1.putAll(lh2);
	         System.out.println(lh1);
	        
	         lh2.keySet();//we can't give iterator directly in map
	         
	         Set key = lh2.keySet();
	         Collection value = lh2.values();
	         Set entry = lh2.entrySet();
	         Iterator i = key.iterator();
	         while(i.hasNext())
	         {
	      	   System.out.println(i.next());
	         }
	         System.out.println(key);
	         System.out.println(value);
	         System.out.println(entry);
	         lh2.replace(18, null,252);
	         System.out.println(lh2);
	         System.out.println(lh1.size());
	         lh1.remove(16);
	         
	         System.out.println(lh1);
	         lh2.remove(20);
	         
	         System.out.println(lh2);
	         System.out.println(lh1.size());
	         
	         boolean containsKey = lh1.containsKey(12);
	         System.out.println(containsKey);
	         
	         boolean containsValue = lh1.containsValue(235);
	         System.out.println(containsValue);
	         
	         lh1.replaceAll((k , v)->258);
	         System.out.println(lh1);
	         
	         boolean equals = lh1.equals(lh2);
	         //boolean equalsKey = lh1.equals(lh2);

	         System.out.println(lh2);
	         System.out.println(equals);
	         //System.out.println(equalsKey);
	         
	       }

}
