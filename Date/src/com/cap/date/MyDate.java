package com.cap.date;

import java.util.Scanner;

public class MyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
 Scanner s=new Scanner(System.in);
 System.out.println("enter the start date in dd-mm-yyyy format");
 String startdate = s.next();
 System.out.println("enter the end date in dd-mm-yyyy format");
 String enddate = s.next();
 Date ob1=new Date(Integer.parseInt(startdate.substring(0, 2)),Integer.parseInt(startdate.substring(3, 5)),Integer.parseInt(startdate.substring(6, 10)));
	Date ob2=new Date(Integer.parseInt(enddate.substring(0, 2)),Integer.parseInt(enddate.substring(3, 5)),Integer.parseInt(enddate.substring(6,10 )));
System.out.println("difference in days is : "+ob1.daysBetween(ob2));
	}

	
}
