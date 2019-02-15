package com.example;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Engineer;
import com.example.domain.Manager;
import com.example.domain.Employee;

public class EmployeeTest {
	public static void printEmployee(Employee e1)
	{
		System.out.println(e1.getEmployeeId());
		System.out.println(e1.getEmployeeName());
		System.out.println(e1.getEmployeeSSN());
		System.out.println(e1.getEmployeeSalary());
		
	}

	public static void main(String[] args) {
		
		
		Engineer e=new Engineer(101, "Jane Smith", "123-234-567", 500000);
		EmployeeTest.printEmployee(e);
		Manager m1=new Manager(207, "Tom", "567-456-678", 70000,"US marketing");
		EmployeeTest.printEmployee(m1);
		Admin a1=new Admin(134, "hello", "987-654-321", 400000);
		EmployeeTest.printEmployee(a1);
		Director d1=new Director(112, "susan", "123-456-789", 800000, "GlobalMarketing", "10000");
		EmployeeTest.printEmployee(d1);
		m1.raiseSalary(45999);
		EmployeeTest.printEmployee(m1);
	}
}

