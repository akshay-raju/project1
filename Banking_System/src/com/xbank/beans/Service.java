package com.xbank.beans;

public class Service {
	private static int counter=1;
	private String serviceId;
	private String customerName;
	private String accountNumber;
	private int track;
	
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Service.counter = counter;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Service( String customerName, String accountNumber) {
		super();
		this.serviceId = "serv90"+counter;
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		counter++;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	

}
