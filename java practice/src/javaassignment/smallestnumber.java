package javaassignment;

public class smallestnumber 
{

	public static void main(String[] args)
	{
		int [] array =new int[] {67,78,890,9874,98765};
		int min =array[0];
		for(int i=0; i<array.length;i++)
		{
			if(array[i]<min) 	
				min = array[i];
		}
			System.out.println("smallest number:"+min);
		}
	}


