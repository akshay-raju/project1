package com.cap.acc;

public class Account {
	private String id;
	private String name;
	private int balance=0;
	Account(String id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Account(String id,String name,int balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public String getid() {
		return id;
	}
	public String getname()
	{
	return name;
	}
	public double getbalance() {
		return balance;
	}
	public int credit(int amount) {
		balance=balance+amount;
		System.out.println("amount credited  is:"+amount);
		System.out.println("balance is:"+balance);
		return balance;
	}
	public int debit(int amount) {
		if(amount<=balance) { 
			balance=balance-amount;
		System.out.println("amount is debited is:"+amount);
		System.out.println("balance is:"+balance);
	       }
		else {
			System.out.println("amount is debited is:"+amount);
		System.out.println("Amount exceeded balance");
			
		}
		return amount;
	}
	public int transferto(Account another,int amount) {
		if(amount<=balance)
			another.balance=amount;
		System.out.println("amount exceeded balance");
		return balance;
	}
	@Override
	public String toString() {
		return ("Account id=" + id + " name=" + name + " balance=" + balance );
	}
	
}
