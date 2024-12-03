package com.oopsctr;

public class MyDate 
{
	private int dd,mm,yy;
	public MyDate()
	{
		System.out.println("I am in default constructor..");
		dd=22;
		mm=10;
		yy=2024;
	}
	public MyDate(int d,int m,int y)
	{
		System.out.println("Inside parameterised constructor");
		dd=d;
		mm=m;
		yy=y;
	}
	public MyDate(int d,int m)  //Constructor overloading
	{
		System.out.println("Inside overloaded constructor");
		dd=d;
		mm= m;
	}
	public void setDd(int d)
	{
		dd=d;
	}
	public int getDd()
	{
		return dd;
	}
	public void setMm(int m)
	{
		mm=m;
	}
	public int getMm()
	{
		return mm;
	}
	public void setYy(int y)
	{
		yy=y;
	}
	public int getYy()
	{
		return yy;
	}
	public void show()
	{
		System.out.println("Date is:"+dd+"/"+mm+"/"+yy);
	}

	public static void main(String[] args) 
	{
		MyDate obj = new MyDate();
		obj.show();	
		obj.setDd(25);
		obj.setMm(12);
		obj.setYy(2022);
		obj.show();	
		MyDate obj1=new MyDate(22,20,2022);
		obj1.show();
		MyDate obj2= new MyDate(17,8);
		obj2.show();
	}

}
