package com.Assignment1;
import java.util.Scanner;
public class Shop {

	public static void main(String[] args) {
		String name,email,bname;char grn;
		int qty;double price;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Author name");	
		name=sc.nextLine();
		System.out.println("enter Author Email");	
		email=sc.nextLine();
		System.out.println("enter Author Gender");
	     grn=sc.next().charAt(0);
	     
		Author a=new Author(name, email, grn);
		Book b=new Book("Raja's Biography",999999.99,1);
		
		a.display();
		b.display2();
		
		

	}

}
