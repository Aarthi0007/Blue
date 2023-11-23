package javaassignment;

public class Duplicateelement 
{

	public static void main(String[] args) 
	{
		int array[] = new int [] {4,6,7,8,9,5,5,5,8,8};
		System.out.println("Duplicate elements in given array: ");
		
		for(int i = 0;i<array.length;i++)
		{
		for(int j = i+1;j<array.length;j++)
		{
			if(array[i]==array[j])
					{
        System.out.println(array[j]);
					}
	}

}
}
}