package com.example.domain;

public class Director extends Manager{
private String budget;

public Director(int employeeId, String employeeName, String employeeSSN, double employeeSalary, String deptName, String budget) {
	super(employeeId, employeeName, employeeSSN, employeeSalary,deptName);
	this.budget = budget;
}

public String getBudget() {
	return budget;
}


}
