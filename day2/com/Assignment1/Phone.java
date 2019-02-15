package com.Assignment1;

import java.util.ArrayList;

public class Phone {
   
	String name,sname;
	long mn1,mn2;
	public Phone(String name) {
		super();
		this.name = name;
		
	}
	public void Phone1(long mn1) {
		
		this.mn1 = mn1;
		
	}
	public void Phone2(long mn2) {
		
		this.mn2 = mn2;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMn1() {
		return mn1;
	}
	public void setMn1(long mn1) {
		this.mn1 = mn1;
	}
	public long getMn2() {
		return mn2;
	}
	public void setMn2(long mn2) {
		this.mn2 = mn2;
	}
	 ArrayList<Phone> li=new ArrayList<Phone>();
	public void search(String sname)
	{
		
		this.sname=sname;
		
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", mn1=" + mn1 + "]";
	}
	
	
	
	
}
