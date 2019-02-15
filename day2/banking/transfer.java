package banking;
import java.util.*;

public class transfer {
	String id;
	int amount;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	String name;
	int balance;
	
	private Scanner input2;
	
	
	public String toString(){//overriding the toString() method  
		  return id+" "+name+" "+balance;
	}
	public transfer() {
		// TODO Auto-generated method stub
		input2 = new Scanner(System.in);
		System.out.print("Enter amount: ");
    	 amount = input2.nextInt();
	   if(amount<=balance)
	   {
		   System.out.println("Amount transfered");
		   balance=balance-amount;
	   }
	   else
	   {
		   System.out.println("insufficient funds");
	   }
	}
}