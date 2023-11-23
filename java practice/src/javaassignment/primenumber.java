package javaassignment;

public class primenumber 
{

	public static void main(String[] args) 
	{
		int num =3,count =0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
			
		}
	
	if(count==2)
	{System.out.println("number is not prime number:"+num);}
	else {System.out.println("number is prime number:"+num);}
}
}