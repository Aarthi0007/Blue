package javaassignment;

public class vowelstring
{

	public static void main(String[] args) 
	{
		String a = new String("this Is string vowels found");
		 a = a.toLowerCase();
		for (int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') 		
				System.out.println("given string is:" + a.charAt(i));
			
			}
	}

}
