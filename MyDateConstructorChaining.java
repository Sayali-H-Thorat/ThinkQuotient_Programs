package com.oopsctr;

public class MyDateConstructorChaining 
{
	int dd,mm,yy;
	
	public MyDateConstructorChaining()
	{
		this(12,12,2022);
	}
	
	public MyDateConstructorChaining(int dd,int mm,int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void display()
	{
		System.out.println("Date is: "+dd+"/"+mm+"/"+yy);
	}

	public static void main(String[] args) 
	{
		MyDateConstructorChaining mobj = new MyDateConstructorChaining();
		mobj.display();
		
		MyDateConstructorChaining mobj1 = new MyDateConstructorChaining(11,11,2011);
		mobj1.display();
	}

}
