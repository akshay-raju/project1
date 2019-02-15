package com.cap.student;

public class Student {
	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name + "(" + address +")";
	}


	public String getName() {
		return name;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	private String name;
	private String address;
	private int numCourses=0;
	private String[] courses=new String[30];
	private int[] grades=new int[30];
	public Student(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	public void addCourseGrade(String course,int grade)
	{
		 courses[numCourses] = course;
	      grades[numCourses] = grade;
	      ++numCourses;	
	}
	   public void printGrades() {
		      System.out.print(name);
		      for (int i = 0; i < numCourses; ++i) {
		         System.out.print(" " + courses[i] + ":" + grades[i]);
		      }
		      System.out.println();
		   }
	   public double getAverageGrade() {
		      int sum = 0;
		      for (int i = 0; i < numCourses; ++i) {
		         sum += grades[i];
		      }
		      return (double)sum/numCourses;
		   }
		
}
