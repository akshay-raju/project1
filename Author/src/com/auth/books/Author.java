package com.auth.books;

public class Author {
	private String Authorname;
	private String email;
	private char gender;
	public Author(String Authorname, String email, char gender) {
		super();
		this.Authorname = Authorname;
		this.email = email;
		this.gender = gender;
	}
	public Author(Object authorname2, Object email2, int i) {
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAuthorName() {
		return Authorname;
	}
	public char getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Author [name=" + Authorname + ", email=" + email + ", gender=" + gender + "]";
	}
	
	

}
