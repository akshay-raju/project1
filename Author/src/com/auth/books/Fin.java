package com.auth.books;
import java.util.Scanner;
public class Fin {

	private static Scanner sc;

	public static void main(String[] args) {
		Author a=new Author("v", "f", 'F');
		Book b=new Book("hi", "hell", 'M', 1000, 10);
		sc = new Scanner(System.in);
		String Authorname = sc.nextLine();
		System.out.println("Name: "+Authorname);
		 
		 String email = sc.nextLine();
		 System.out.println("Name: "+email);
		 char gender = sc.next().charAt(0);
		System.out.println("Gender: "+gender);
		String Bookname = sc.nextLine();
		System.out.println(a);
		System.out.println("Name: "+Bookname);
		 
		 int price = sc.nextInt();
		 System.out.println("Name: "+price);
		int qty = sc.nextInt();
		System.out.println("Gender: "+qty);
		System.out.println(b);

	}

}
