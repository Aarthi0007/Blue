package javaassignment;

public class consonants 
{

	public static void main(String[] args)
	{
		char a[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		System.out.println("consonants are:");

	for(int i=0;i<a.length;i++)
	{
		if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') 
		{
			System.out.print("");
		}
		else
		{
		System.out.print(a[i]);
			}	
		
	}

	}
}
