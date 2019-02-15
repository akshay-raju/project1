package com.auth.books;

public class Book extends Author {
	public Book(String name, String email, char gender) {
		super(name, email, gender);
		// TODO Auto-generated constructor stub
	}

	Author Book=new Author("name", "hi",'m');
	private String Bookname;
	private double price;
	private int qty=0;
	public Book(String Bookname, String email, char gender, double price) {
		super(Bookname, email, gender);
		
		this.Bookname=Bookname;
		this.price = price;
	}
	public Book(String name, String email, char gender, double price, int qty) {
		super(name, email, gender);
		
		Book.getAuthorName();
		Book.getEmail();
		Book.getGender();
		this.price = price;
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getBookName() {
		return Bookname;
	}
	
	@Override
	public String toString() {
		return "Book [a=" + Book.getAuthorName() + ", name=" + Book  + ", author=" + ", price=" + price + ", qty=" + qty + "]";
	}
	public void setName(String Bookname) {
		this.Bookname = Bookname;
	}
	
	
	

}
