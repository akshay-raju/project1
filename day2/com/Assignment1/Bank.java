package com.Assignment1;
import java.util.*;
public class Bank {

	public static void main(String[] args) {
		String name;int id1,id2;char gender;
		double bal,amt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer name");
		name=sc.nextLine();
		System.out.println("Enter the Id");
		id1=sc.nextInt();
		System.out.println("Enter the Id");
		id2=sc.nextInt();
		System.out.println("Enter the Gender");
		gender=sc.next().charAt(0);
		System.out.println("Enter the Balance");
		bal=sc.nextDouble();
		System.out.println("Enter the Amount");
		amt=sc.nextDouble();
		Customer c=new Customer(id1,name,gender);
		Account a=new Account(id2,c,bal);
		a.deposit(amt);
		a.withdraw(amt);
	}

}
