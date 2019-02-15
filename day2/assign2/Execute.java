package assign2;

import java.util.Scanner;

public class Execute {
	
	public static void main(String[] args) {
	    String name1,type1,date;
	    int services,product;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
	 name1=sc.nextLine();
		System.out.println("enter the membership type");
		type1=sc.nextLine();
		
		System.out.println("enter date");
		date=sc.nextLine();
		
         customer c=new customer();
         c.setName(name1);
       
         c.setMship(type1);
         visit v=new visit();
         v.setDate(date);
         System.out.println("enter the service cost");
 		services=sc.nextInt();
 		System.out.println("enter the products cost");
 		product=sc.nextInt();
 		  v.setServices(services);
 		  v.setProduct(product);
         v.visitor();
         Discount d=new Discount();
         d.eprice();
         
	}

}
