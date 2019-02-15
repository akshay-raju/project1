package date_diff;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start date in dd-mm-yyyy format");
		String startDate= sc.next();
		System.out.println("enter end date in dd-mm-yyyy format");
		String endDate= sc.next();
		MyDate obj1=new MyDate(Integer.parseInt(startDate.substring(0,2)),Integer.parseInt(startDate.substring(3,5)),Integer.parseInt(startDate.substring(6,10)));
		MyDate obj2=new MyDate(Integer.parseInt(endDate.substring(0,2)),Integer.parseInt(endDate.substring(3,5)),Integer.parseInt(endDate.substring(6,10)));
		System.out.println("no of days are : "+obj1.daysDifference(obj2));
		
	
		// TODO Auto-generated method stub

	}

}
