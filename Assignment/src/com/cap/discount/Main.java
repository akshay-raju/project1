package com.cap.discount;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Customer c1=new Customer("akshay");
		c1.isMember();
		c1.setMember(true);
		c1.getMemberType();
		c1.setMemberType("GOLD");
		c1.getName();
		
		Visit v1=new Visit("akshay","11/12/2018");
		v1.getName();
		v1.getServiceExpense();
		double ex = 20000;
		v1.setServiceExpense(ex);
		v1.getProductExpense();
		v1.setProductExpense(ex);
		v1.getTotalExpense();
		
		
		Discount d1=new Discount("akshay", "11/12/2018");
		Discount.getServiceDiscountRate("GOLD");
		Discount.getProductDiscountRate("SILVER");
		System.out.println(c1);
		System.out.println(v1);
		System.out.println(d1);
	}
		catch (Exception e) {
			System.out.println("exception handled");
		}

}
}
