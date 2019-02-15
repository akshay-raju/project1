package date_diff;

public class MyDate {
	private static int[] month_days1={31,28,31,30,31,30,31,31,30,31,30,31};
	private int dd;
	private int mm;
	private int yy;
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public MyDate(int dd, int mm, int yy) {
		super();
		
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public int daysDifference(MyDate endDate) {
		int noOfDays=0;
	    do {
	    	if(this.mm==endDate.getMm() && this.yy==endDate.getYy()) {
	    		noOfDays+=endDate.getDd()-this.getDd();
	    		break;
	    		
	    	}
	    	else {
	    		if(this.mm==2) {
	    			if((this.yy%400==0)||(this.yy%4==0 && this.yy%100!=0))
	    				noOfDays++;
	    		}
	    		
	    		noOfDays+=month_days1[this.getMm()-1]-this.getDd();
	    	}
	    	
	    	this.dd=0;
	    	this.mm++;
	    	if(this.mm>12) {
	    		this.yy++;
	    		this.mm=1;
	    	}
	    }while(true);
		return noOfDays;
		
		
	}

}
