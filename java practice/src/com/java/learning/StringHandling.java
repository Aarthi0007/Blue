package com.java.learning;

public class StringHandling 
{
	public static void main(String[] args) 
	  {
	    String str = new String("HEllo");//new keyword
	   String s = "java";//literal
	  // String s1 = " user friendly language"; 
	    //String s = "programming language concept";
	    StringBuffer sb = new StringBuffer("object");
	    StringBuilder sb1 = new StringBuilder("oriented");
	    System.out.println(sb);
	    System.out.println(sb1);
	    System.out.println(sb.append(sb1));
	    //System.out.println(sb);
	    System.out.println(sb.reverse());
	    //System.out.println(sb);
	    System.out.println("____________________");
	    System.out.println(str.hashCode());
	    System.out.println(s.hashCode());
	    System.out.println(s.length());
	    System.out.println(s.toUpperCase());
	    System.out.println(s.toLowerCase());
	    System.out.println(s.indexOf('j'));
	    System.out.println(s.lastIndexOf('a'));
	    System.out.println(str.charAt(1));
	    System.out.println(s.startsWith("programming"));
	    System.out.println(s.endsWith("ept"));
	    System.out.println(s.contains("langu"));
	    System.out.println(s.equals("programming"));
	    System.out.println(s.equalsIgnoreCase("language"));
	    System.out.println(s.repeat(3));
	    System.out.println(s.replace('j', 'O'));
	    System.out.println(str.replace('l','e' ));
	   System.out.println(s.concat(" Automation"));
	    //System.out.println(s.concat(s1));
		}

}
