package com.java.learning;
import java.util.*;
import java.util.Set;
public class Mapdemo
{
	public static void main(String[] args)
	{
		HashMap <Integer , String>hm = new HashMap<>();
		//hm.put(00,"singala");
		hm.put(200, "english");
		hm.put(102, "hindi");
		hm.put(156, "french");
		hm.put(105, null);
		hm.put(100, "powly");
		hm.put(1, "greek");
		hm.put(null, "heibru");
		hm.put(null, "chainese");
		//hm.put(null, "japnese");
		hm.put(101, "japanese");
		//hm.put(101, "hindi");
		hm.put(108, "german");
		hm.put(110, "arabic");
		hm.put(115, "singala");
		hm.put(126, "japnese");
		hm.put(196, "japnese");
		hm.put(165, "urudu");
		//hm.put(200, "heibru");
		//hm.put(115, "spanish");
		//hm.put(125, "ganesh");
		//hm.put(198, "ganesh");
				
		 Set<Integer> key = hm.keySet();
		
		Collection<String> value = hm.values();
		
		Set entry =  hm.entrySet();
		
		Iterator itr = key.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
      System.out.println(key);
      System.out.println(value);
      System.out.println(entry);
      
      hm.replace(196,"japnese", "heibru");
      System.out.println(hm);
      
      System.out.println(hm.size());
      
      hm.remove(100);
      System.out.println(hm);
      
      hm.putIfAbsent(125, "singala");
      System.out.println(hm);
       
      hm.replaceAll((K,v) ->"tamil");
      System.out.println(hm);
      
      boolean containsKey = hm.containsKey(196);
      System.out.println(containsKey);
      
      boolean containsValue = hm.containsValue("urudu");
      System.out.println(containsValue);
      
      hm.clear();
       System.out.println(hm);
       
      Iterator i = entry.iterator();
      
       while(i.hasNext()) 
      {
    	 Map.Entry me = (Map.Entry)i.next(); 
    	 System.out.println(me.getKey()+"--"+me.getValue()); 
      }
      
	}


}
