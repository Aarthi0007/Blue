package com.java.learning;

public class Top {
	 
		public static void top(String s) {
			System.out.println("B");
		}
	

	public class bottom2 extends Top {
		{
			System.out.println("D");
		}
	}
		public static void main(String[] args) {

			
			 bottom2.top("C");
			System.out.println(" ");
		}
	

}
