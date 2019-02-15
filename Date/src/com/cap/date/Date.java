package com.cap.date;

public class Date {
	private int dd;
	private int mm;
	private int yyyy;
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
	public int getYyyy() {
		return yyyy;
	}
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	public Date(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public long daysBetween(Date m) { 
		long difference = this.dd-m.getDd()+(this.mm-m.getMm())*30+(this.yyyy-m.getYyyy())*365; 
		long x=Math.abs(difference);
		if((this.getYyyy()%400==0) || (this.getYyyy()%4==0 && this.getYyyy()%100!=0))
			x++;
		return x; 
		}
	}

