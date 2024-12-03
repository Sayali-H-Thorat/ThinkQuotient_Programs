package com.oopsctr;

public class thisreferenceconcept 
{
	private int dd,mm,yy;
	
	public thisreferenceconcept()
	{
		dd=22;
		mm=10;
		yy=2022;
	}
	public thisreferenceconcept(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void show()
	{
		System.out.println("Date is:"+this.dd+"/"+this.mm+"/"+this.yy);
	}
	
	public thisreferenceconcept compareDate(thisreferenceconcept obj)
	{
		System.out.println("Inside compareDate:");
		System.out.println("current value of this reference is:"+this.dd+"/"+this.mm+"/"+this.yy);
		System.out.println("Value store in obj is:"+obj.dd+"/"+obj.mm+"/"+this.yy);
		
		if(this.yy> obj.yy)
			return obj;
		else if(this.yy<obj.yy)
			return this;
		else if(this.mm > obj.mm)
			return obj;
		else if(this.mm < obj.mm)
			return this;
		else if(this.dd > obj.dd)
			return obj;
		else
			return this;
	}

	public static void main(String[] args) 
	{		
//		thisreferenceconcept obj = new thisreferenceconcept();
//		obj.show();
		
		thisreferenceconcept obj1 = new thisreferenceconcept(23,12,2020);
		obj1.show();
		
		thisreferenceconcept obj2 = new thisreferenceconcept(24,12,2020);
		obj2.show();
		
		System.out.println("____________________________________");
		thisreferenceconcept cobj = obj1.compareDate(obj2);
		System.out.println("Maximum date is:");
		cobj.show();
	}

}
