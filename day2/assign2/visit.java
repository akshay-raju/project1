package assign2;
import java.util.*;
//import assign2.customer;
public class visit {
     
     	
    
    static String type;
    String date;
	static int services;
	static int product;
	
	
	public static String getType() {
		return type;
	}
	public void setType(String type) {
		
		this.type = customer.getMship();
		System.out.println(type);
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		
		this.date = date;
	}
	public static int getServices() {
		return services;
	}
	public void setServices(int services) {
		
		this.services = services;
	}
	public static int getProduct() {
		return product;
	}
	public void setProduct(int product) {
		
		this.product = product;
	}
	
	void visitor()
	{
		 String c1name=customer.getName();
		System.out.println("The name of the customer is:"+c1name+"visited on"+date);
		
	}

}