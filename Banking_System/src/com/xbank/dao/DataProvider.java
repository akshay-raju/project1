package com.xbank.dao;

import java.util.ArrayList;

import com.xbank.beans.Account;
import com.xbank.beans.Person;

public class DataProvider {
	static ArrayList<Person> persons;
	
	public static void customers(){
		
	    persons=new ArrayList<Person>();
		Account account1=new Account("Savings Account",1000);
		Person person1=new Person("gopikrishna","banglore","9999999999","fdhdf@gmail.com","gopikrishna","gopi",account1);
		persons.add(person1);
		Account account2=new Account("Current Account",10000);
		Person person2=new Person("akshay","banglore","8888888888","fdhdf@gmail.com","akshay","akshay",account2);
		persons.add(person2);
	}
	
	public static boolean addPerson(Person person) {
		persons.add(person);
		return true;
		
	}
	
	public static ArrayList<Person> getcustomers(){
		return persons;
	}

}
