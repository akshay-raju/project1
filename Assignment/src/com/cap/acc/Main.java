package com.cap.acc;



public class Main {

	public static void main(String[] args) {
		
		Account a1=new Account ("123", "hi",0);	
         System.out.println(a1);
        
		
		a1.credit(150);
		a1.debit(100);

	}

}
