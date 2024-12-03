package com.oops.basic;

/*
 * Data members: data members are initialised with its default value.
 * data members are accessible in all the methods of a class
 * To access the data member in main method we need to create object.
 * Syntax:
 *   classname variablename = new classname();
 *   Every object of a class is having its own copy of data member
 *   */
public class MyDate
{
	private int dd,mm,yy;
	
	public void setData(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void display()
	{
		System.out.println("Date is:"+dd+"/"+mm+"/"+yy);
	}

	public static void main(String[] args) 
	{
		System.out.println("___________________________");
		System.out.println("Output without giving any value to it.");
		MyDate obj = new MyDate();
		obj.display();
		System.out.println("___________________________");
		System.out.println("Output giving value to it.");
		obj.dd=18;
		obj.mm=10;
		obj.yy=2024;
		obj.display();
		System.out.println();
		obj.dd=12;
		obj.mm=12;
		obj.yy=2024;
		obj.display();
		System.out.println("___________________________");
		System.out.println("Output using seData method.");
		MyDate obj3 = new MyDate();
		obj3.setData(17, 10, 2024);
		obj3.display();

	}

}
