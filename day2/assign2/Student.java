package assign2;
import java.util.*;
public class Student {
	String name;
	String address;
	int size,marks;
	int numcourse;
	 String[] courses= new String[4];
	
	int[] grades= new int[4];
	
	Scanner sc = new Scanner(System.in);
	
	void student()
	{
		
		name=sc.nextLine();
		address=sc.nextLine();
		System.out.println("Name is"+""+name+"address is"+""+address);
	}
	void addCourseGrade()
	{
           	
	    
	      
	      System.out.println("please enter the courses");
	      for(int i=0;i<courses.length;i++)
	      {
	    	  
	    	courses[i]=sc.nextLine();  
	      }
	     
	      
	      System.out.println("please enter the grades");
	      for(int i=0;i<courses.length;i++)
	      {
	    	grades[i]=sc.nextInt();  
	      }
	      
		 for(int i=0;i<courses.length;i++)
		 {
			 
				 System.out.println("course:grade"+courses[i]+":"+grades[i]);
				 
			 
		 }
        int sum=0;
		 for(int i=0;i<courses.length;i++)
		 {
			 sum=sum+grades[i];
			 
			
		 }
		   int avg=0;
		   avg=sum/courses.length;
		   System.out.println("avg:"+avg);
}
	
	
	
}