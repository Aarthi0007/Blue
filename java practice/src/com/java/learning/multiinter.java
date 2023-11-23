package com.java.learning;

interface Stud1
{
	void mark();
}
interface Stud2
{
	void result();
}
class Student implements Stud1,Stud2
{
	public void mark()
	{
		System.out.println("see the mark");
	}
	public void result()
	{
		System.out.println("see the result");
	}
}
public class multiinter
{

	public static void main(String[] args)
	{
		Student s = new Student();
		s.mark();s.result();

	}

}
