package com.oops.basic;

public class StudentManagementSystem {

	public static void main(String[] args) 
	{
		Student sobj=new Student();
		sobj.setData(1, "Sahil", 55, 67, 78, 95, 50);
		sobj.calculatepercentage();
		sobj.calculateGrade();
		sobj.display();
		System.out.println("_____________________________");
		sobj.setName("Saahil");
		System.out.println(sobj.getGrade());
		sobj.display();
		System.out.println("________________________");
		Student sobj1=new Student();
		sobj1.setData(2, "Sanika", 55, 49, 70, 78, 98);
		sobj1.calculatepercentage();
		sobj1.calculateGrade();
		sobj1.display();
		System.out.println("________________________");
		

	}

}
