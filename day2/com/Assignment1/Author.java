package com.Assignment1;

public class Author {
	private String name;
	private String email;
	 private char gender;
	public  Author(String name, String email, char gender) {
		    super();
			this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void display()
	{
		 System.out.println( "Name of the author--"+name+"  "+"Email:"+email+"  "+"Gender-"+gender);
		
	}

}
