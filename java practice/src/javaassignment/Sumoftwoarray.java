package javaassignment;

public class Sumoftwoarray
{

	public static void main(String[] args) 
	{
		int a[] = {2,5,7,8,9,10};
		int b[] = {4,7,8,9,3,5};
		int c[] = new int [a.length];
		for(int i=0;i<a.length;i++)
		{
			c[i] = a[i]+b[i];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(c[i]+" ");
		}
			
			
			
			
			
	}

}
