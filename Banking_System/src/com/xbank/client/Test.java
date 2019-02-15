package com.xbank.client;

import java.util.Scanner;

import com.xbank.beans.Person;
import com.xbank.dao.DataProvider;
import com.xbank.services.XbankService;
import com.xbank.services.XbankServiceImpl;

public class Test {

	public static void main(String[] args) {
		DataProvider.customers();
		System.out.println("                               welcome to X bank                                 ");
		System.out.println("------------------------------------------------------------------------------------");
		Scanner sc=new Scanner(System.in);
		XbankService service = new XbankServiceImpl();
		int i;
		do {
			System.out.println("select options");
			System.out.println("    1.New user");
			System.out.println("    2.Existed user");
			System.out.println("    3.Exit");
		    
			i=sc.nextInt();	
			switch(i) {
			case 1:System.out.println("enter your name");
			       String name=sc.next();
			       System.out.println("enter mobile number");
			       String mobileNumber=sc.next();
			       System.out.println("enter email id");
			       String emailId=sc.next();
			       System.out.println("eneter address");
			       String address=sc.next();
			       System.out.println("give a user name");
			       String userName=sc.next();
			       System.out.println("give a password");
			       String password=sc.next();
			       System.out.println("opening Account choose account type");
			       System.out.println("    1.Savings Account");
			       System.out.println("    2.Current Account");
			       
			       int j=sc.nextInt();
			       String accountType;
			       if(j==1)
			    	    accountType="Savings Account";
			       else
			    	   accountType="Current Account";
			       
			       System.out.println("opening Balance");
			       double openingBalance=sc.nextDouble();
			       
			       
			       
			       
			      String accountNumber= service.createNewAccount(name, address, mobileNumber, emailId, accountType, openingBalance, userName, password);
			      System.out.println("your Account number is :"+accountNumber);
			      System.out.println("Now login with your user id and password\n");
			      break;
			case 2:System.out.println("Log in to your Account");
			       System.out.println("User Name:");
			       String loginuserName=sc.next();
			       System.out.println("Password:");
			       String loginPassword=sc.next();
			       int count=0;
			       for(int attempts=0;attempts<2;attempts++)
			       {
			    	   if(service.login(loginuserName, loginPassword)==null)
			    	   {
			    		   System.out.println("invalid password try again");
			    	   
			    	   System.out.println("Password:");
				       loginPassword=sc.next();
				       count++;
				       
			       }
			    	   else
			    	   {
			    		   System.out.println("your logged in succesfully"); 
			    		   break;
			    	   }
			       }
			       if(count==2) {
			    	   System.out.println("Your account has been locked");
			       }
			       
			       
			       Person customer=service.login(loginuserName, loginPassword);
			       if(customer!=null) {
			    	  
			    	   int choice;
			    	   do {
			    	   System.out.println("Hello "+customer.getName()+"\n                                              Home              ");
			    	  
			  
			    	   System.out.println("---------------------------------------------------------------------------------------------");
                       System.out.println("select service");
                       System.out.println("     1.view mini/detailed statement");
                       System.out.println("     2.change in address");
                       System.out.println("     3.change in mobile number");
                       
                       System.out.println("     4.Request for cheque book");
                       System.out.println("     5.track service request");
                       System.out.println("     6.fund transfer");
                       System.out.println("     7.change password");
                       System.out.println("     8.Log out");
                       choice=sc.nextInt();
                       switch(choice) {
                       case 1:break;
                       case 3:System.out.println("existing number : "+customer.getMobileNumber());
                              System.out.println("enter new number");
                              String newNumber=sc.next();
                              service.changeInPhoneNumber(customer,newNumber);
                              System.out.println("mobile number updated successfully");
                              
                       
                    	   break;
                       case 2:System.out.println("existing address : "+customer.getAddress());
                       		  System.out.println("enter new address");
                       		  String newAddress=sc.next();
                       		  service.changeInAddress(customer,newAddress);
                       		  System.out.println("address updated successfully");
                    	   break;
                       case 4:break;
                       case 5:break;
                       case 6:break;
                       case 7:System.out.println("existing password : "+customer.getPassword());
                		  	  System.out.println("enter new password");
                		  	  String newPassword=sc.next();
                		  	  service.changePassword(customer,newPassword);
                		  	  System.out.println("password updated successfully");
                    	      break;
                       case 8:break;
                       }
			    	   }while(choice!=8);
			       System.out.println("your looged out successfully");
                       
			       }
			    	   
			       else
			       {
			    	   System.out.println("incorrect password or user name");
			       }
			       
			       break;
			       
				
			
			}
			
		}while(i!=3);
		System.out.println("thank you for banking with us");
		

	}

}
