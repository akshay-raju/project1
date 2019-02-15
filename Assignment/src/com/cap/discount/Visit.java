package com.cap.discount;

/**
 * The Discount System: Visit.
 */
public class Visit extends Customer
{	
	
    private Customer customer;
    private Object date;
    private double serviceExpense;
    private double productExpense;
    
    public Visit(String name, String date)
    {
    	super(name);
    	this.customer=customer;
        this.date       = date;
    }
    
    public String getName() {
        return customer.getName();
    }
    
    public double getServiceExpense() {
        return serviceExpense;
    }
    
    public void setServiceExpense(double ex) {
        serviceExpense = ex;
    }

    public double getProductExpense() {
        return productExpense;
    }
    
    public void setProductExpense(double ex) {
        productExpense = ex;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }
    
    public String toString() {
        return String.format("Visit of customer %1$s at date %2$s"
                            , customer.toString(), date.toString());
    }
}	
