package javaassignment;

public class middleelement
{
	
 public static void main(String[] args) 
{
       float array[] = new float [] {2,4,5,6.5f,7,8,8};
       if(array.length%2==0)
       {
    	   System.out.println("The middle of the element:");
    	  float a = array [(array.length/2)-1];
    	  System.out.println(a);
    	  float b = array[array.length/2];
    	  System.out.println(b);
       }
       else
       {
    	   float c =array [array.length/2];
    	   System.out.println("the middle of element:");
    	   System.out.println(c);
       }
       
  }
}
