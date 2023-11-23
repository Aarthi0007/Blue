package com.java.learning;

public class encapsulation
{
	
	  private int rollno;
	  private String name;
	  private String dept;
	  private String grade;
   	  public void setname(String name) 
	  {
		this.name = (name + " Iyyapan");
	  }
	  public String getname()
	  {
		  return name;
	  }
	  public void setrollno(int rollno)
	  {
		  this.rollno = rollno;
	  }
	  public int getrollno()
	  {
		  return rollno;
	  }
	  public void setdept(String dept)
	  {
		  this.dept = dept;
	  }
	  public String getdept()
	  {
		  return dept;
	  }
	  public void setgrade(String grade)
	  {
		  this.grade = grade;
	  }
	  public String getgrade()
	  {
		  return grade;
	  }
	
	public static void main(String[] args)
	{
		
		{
			  encapsulation e = new encapsulation();
			  e.setdept("ECE");
			  e.setgrade("S grade");
			  e.setname("naresh");
			  e.setrollno(346788098);
			  System.out.println("Name: " + e.getname());
			  System.out.println("Rollno: " + e.getrollno());
			  System.out.println("Dept: " + e.getdept());
			  System.out.println("Grade: " + e.getgrade());
			  
			  

			}
	}

	}
