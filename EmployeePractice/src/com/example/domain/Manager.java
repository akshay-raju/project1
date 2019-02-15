package com.example.domain;

public class Manager extends Employee {
	private Employee[] staff=new Employee[20];

	private int employeeCount=0;
	public static String deptName;

	public Manager(int employeeId, String employeeName, String employeeSSN, double employeeSalary, String deptName) {
		super(employeeId, employeeName, employeeSSN, employeeSalary);
		Manager.deptName=deptName;
		staff=new Employee[20];
		
	}

	public String getDeptName() {
		return deptName;
	}
	public int findEmployee()
	{
	for (int i = 0; i < staff.length; i++) {
		System.out.println(staff[i]);
		
	}
	return-1;
}
	public boolean addemployee()
	{
		
		
		return false;
		
	}
}
