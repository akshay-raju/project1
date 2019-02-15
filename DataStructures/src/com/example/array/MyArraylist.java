package com.example.array;

public class MyArraylist {
	
	public Employee[] employees;
	public int n=-1;
	
	public void MyArraylist() {
	employees=new Employee[20];
	}
	public boolean addEmployee(Employee e)
	{
		if(isfull())
		{
			n++;
			employees[n]=e;
			return true;
		}
		return false;
	}
	private boolean isfull() {
		// TODO Auto-generated method stub
		return false;
	}
	public int deleteEmployee(int employeeID)
	{
		n=0;
		int location=0;
		if(isempty())
		{
			for(int i=0;i<20;i++)
			{
				if(employees[i].getEmployeeID()==employeeID)
			{
				location=i;
			}
			}
		}
		return employeeID;
		
	}
	private boolean isempty() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
