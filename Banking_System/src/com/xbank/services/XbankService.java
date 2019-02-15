package com.xbank.services;

import com.xbank.beans.Person;

public interface XbankService {
	
	public Person login(String userName,String password);
	public void printminiStatement();
	public void detailedTransactions();
	public boolean changeInAddress(Person person,String address);
	public boolean changeInPhoneNumber(Person person,String newNumber);
	
	public boolean requestCheckBook();
	public String trackServiceRequest(int serviceNumber);
	public boolean fundTransfer(String toAccount,double amount);
	public boolean changePassword(Person person,String newPassword);
	public String createNewAccount(String name,String address,String mobileNumber,String emailId,String accountType,double openingBalance,String userName,String password);

	
	
	
	

}
  