package com.Assignment1;

public class Book {

	 private Author author;
	  private  String name;
	  private double price;
	  private int qty;
	
	public  Book( String name, double price, int qty) {
		super();
		
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	public String getBname() {
		return name;
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
	public Author getAuthor() {
		return author;
	}
	public void display2()
	{
		System.out.println("Name of the book--"+this.name+"  "+"price of the book:"+this.price+"  "+"Quantity--"+this.qty);
	   
	}
	
	 
}
