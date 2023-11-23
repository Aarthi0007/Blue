package javaassignment;
import java.util.*;

public class Sumofnumber
{

	public static void main(String[] args) 
	{
		
 int s [] [] = {{4,6,8,9} , {3,9,7,5} , {9,7,3,2} ,{ 3,7,9,6}};
 
 for(int i=0;i<1;i++)
 {
	 for(int j=0;j<4;j++)
	 {
	 s [3][j] = s[i] [j] +s[i+1][j] +s[i+2][j];
	 }}
 System.out.println("average of the array: ");
 for(int i=0;i<5;i++)
 {
	 System.out.println(" " + s[3][i]);
 }
 }
	}


