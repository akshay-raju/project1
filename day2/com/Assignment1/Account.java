package com.Assignment1;

public class Account {
	private int id;
	private Customer customer;
	private double bal;
	private double amt;
	public Account(int id, Customer customer, double bal) {
		super();
		this.id = id;
		this.customer = customer;
		this.bal = bal;
	}
	public int getId() {
		return id;
	}
	
	public double getAmt() {
		return amt;
	}
	public Customer getCustomer() {
		return customer;
	}
	public double getBal() {
		return bal;
	}
	
	public void setBal(double bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", customer=" + customer + ", bal=" + bal + ", amt=" + amt + "]";
	}
	public void deposit(double amt)
	{ 
		System.out.println(amt);
		bal=this.bal+amt;
		System.out.println("Balance is added"+bal);
	}
	public void withdraw(double amt)
	{
		if(amt<=bal)
		{
			System.out.println("Money withdrawn");
			bal=bal-amt;
			System.out.println("Remaining Balance"+bal);
		}
		else {
			System.out.println("Insufficient Funds");
		}
	}
}
