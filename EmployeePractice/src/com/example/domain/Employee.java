package com.example.domain;


public class Employee {
	
	;
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getEmployeeSSN() {
		return employeeSSN;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double raiseSalary(double increase)
	{
		
		return employeeSalary+increase;
		
		
	}
	//variable declaration,instance variable
	
	private int employeeId;
	private	String employeeName;
	private	String employeeSSN;
	private double employeeSalary;
	public Employee(int employeeId, String employeeName, String employeeSSN, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSSN = employeeSSN;
		this.employeeSalary = employeeSalary;
	}
	

	
}
