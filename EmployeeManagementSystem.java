package com.oops.basic;

public class EmployeeManagementSystem 
{

	public static void main(String[] args) 
	{
		e_Details eobj1 = new e_Details();
		eobj1.setData(101,"Sayali",501,10000,"abc@gmail.com");
		eobj1.calculateSal();
		eobj1.display();
		System.out.println("_______________________________________");
		eobj1.setDeptno(505);
		eobj1.setEmail("XYX@gmail.com");
		eobj1.setEname("Saayali");
		eobj1.setSal(20000);
		eobj1.calculateSal();
		eobj1.display();
//		eobj1.getNetsal();
//		eobj1.getPf();
//		eobj1.display();
	}

}
