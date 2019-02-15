package com.cap.question2;

import java.util.Iterator;
import java.util.TreeSet;

import question1.SavingAccount;

public class Main {

	public static void main(String[] args) {
		Movie_DetailsList m=new Movie_DetailsList();
		
		Movie_Details m1=new Movie_Details("ddlj", "srk", "kajol", "family");
		Movie_Details m2=new Movie_Details("pk", "aamir", "anushka", "eyeopener");
		Movie_Details m3=new Movie_Details("housefull", "akshay", "karina", "comedy");
		Movie_Details m4=new Movie_Details("kgf", "yash", "kolar", "thriller");
		Movie_Details m5=new Movie_Details("arjun", "vijay", "manju", "A");
		
		m.add_movie(m1);
		m.add_movie(m2);
		m.add_movie(m3);
		m.add_movie(m4);
		m.add_movie(m5);
		TreeSet<String> moviee=m.();
		Iterator<Movie_Details> it = movie.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		

	}

}
