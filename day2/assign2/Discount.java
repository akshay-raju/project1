package assign2;

public class Discount {
	
	
	double srv=visit.getServices();
	 double prod=visit.getProduct();
	String memtype=customer.getMship();
	void eprice()
	{
		
		if(memtype.equals("premium"))
		{
			 double s=srv;
			 double ps=prod;
				srv=s-(srv*0.20);
			prod=(ps-(prod*0.10));
			System.out.println("The cost of service and product for premium are"+srv+"     "+prod);
		}
		if(memtype.equals("gold"))
		{
			 double s=srv; double ps=prod;
			srv=(s-(srv*0.15));
			prod=(ps-(prod*0.10));
			System.out.println("The cost of service and product for gold are"+srv+"   "+prod);
		}
		if(memtype.equals("silver"))
		{
			 double s=srv; double ps=prod;
			srv=(s-(srv*0.10));
			prod=(ps-(prod*0.10));
			System.out.println("The cost of service and product for silver are"+srv+"   "+prod);
		}
	
}
	}
