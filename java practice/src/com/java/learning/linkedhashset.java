package com.java.learning;

import java.util.*;

public class linkedhashset 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(100);
		lhs.add(10);
		lhs.add(16);
		lhs.add(25);
		lhs.add(25);
	    lhs.add(null);
		lhs.add(null);
		lhs.add(10);
		
		Iterator<Integer> it = lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
		lhs1.add(26);
		lhs1.add(35);
		lhs1.add(21);
		lhs1.add(85);
		lhs.addAll(lhs1);
		System.out.println(lhs);
		
		System.out.println(lhs1.size());
		
		lhs1.retainAll(lhs);
		System.out.println(lhs);
		
		lhs1.remove(26);
		System.out.println(lhs1);
	    
		/*lhs.clear();
		System.out.println(lhs);
		Iterator<Integer> it1 = lhs1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}*/

		}

	

	}


