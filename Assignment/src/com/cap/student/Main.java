package com.cap.student;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Student s1 = new Student("akshay", "india");
	      System.out.println(s1);  // toString()

	    
	      s1.setAddress("USA");
	      System.out.println(s1);  
	      System.out.println(s1.getName());
	      System.out.println(s1.getAddress());

	   
	      s1.addCourseGrade("physics", 98);
	      s1.addCourseGrade("chemistry", 97);
	      s1.addCourseGrade("math", 96);
	      s1.printGrades();
	      System.out.printf("The average grade is %.2f%n", s1.getAverageGrade());
	}

}
