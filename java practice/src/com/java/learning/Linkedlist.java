package com.java.learning;

import java.util.LinkedList;
public class Linkedlist
{
	  public static void main(String[] args) 
	  {
		  LinkedList<Integer> ll = new LinkedList<>();
		  ll.add(98);
			 ll.add(23);
			 ll.add(67);
			 ll.add(23);
			 ll.add(78);
			 ll.add(10);
			ll.add(null);
			 ll.add(67);
			 ll.add(99);
			 ll.add(null);
			 
			 ll.add(45);
			 System.out.println(ll);
			 ll.removeFirstOccurrence(23);
			 System.out.println(ll);
			 ll.removeLastOccurrence(null);
			 System.out.println(ll);
			 ll.addFirst(100);
			 System.out.println(ll);
			 ll.addLast(178);
			 System.out.println(ll);

		}

}
