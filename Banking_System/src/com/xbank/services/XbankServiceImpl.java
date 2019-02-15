package com.xbank.services;

import java.util.ArrayList;

import com.xbank.beans.Account;
import com.xbank.beans.Person;
import com.xbank.dao.DataProvider;

public class XbankServiceImpl implements XbankService {

	@Override
	public Person login(String userName, String password) {
		
		Person person=null;
	     ArrayList<Person> persons=DataProvider.getcustomers();
	     for(Person p:persons) {
	    	 if(p.getUserName().equals(userName)&&p.getPassword().equals(password)) {
	    		 person=p;
	    	 }
	     }
		return person;
	}

	@Override
	public void printminiStatement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detailedTransactions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean changeInAddress(Person person,String address) {
	    person.setAddress(address);
		return true;
	}

	@Override
	public boolean requestCheckBook() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String trackServiceRequest(int serviceNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean fundTransfer(String toAccount, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changePassword(Person person,String newPassword) {
		person.setPassword(newPassword);
		return true;
	}

	@Override
	public String createNewAccount(String name, String address, String mobileNumber, String emailId, String accountType,
		double openingBalance, String userName, String password) {
		
		Account account=new Account(accountType,openingBalance);
		Person person=new Person(name,address,mobileNumber,emailId,userName,password,account);
		DataProvider.addPerson(person);
		return account.getAccountNumber();
	}

	@Override
	public boolean changeInPhoneNumber(Person person,String newNumber) {
		person.setMobileNumber(newNumber);
		 return true;
	}

}
