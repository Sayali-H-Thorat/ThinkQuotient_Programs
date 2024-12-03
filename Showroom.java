package com.oopsctr;

public class Showroom 
{
	String carbrand,showroomadd;
	double carprice,revenue;
	int carquantity,showroomNo;
	static double totalrevenueprice;
	
	static
	{
		totalrevenueprice =0;
	}
	public void totalrevenue()
	{
		double revenueprice =carquantity*carprice;
		
		totalrevenueprice = totalrevenueprice+revenueprice;
		System.out.println("Total revenue generated: "+totalrevenueprice);
//		return totalrevenueprice;
	}
	public Showroom()
	{
		carbrand = "Ford";
		carquantity = 1;
		carprice = 44.17;
		showroomNo = 1;
		showroomadd = "Pune";
	}
	public Showroom(String carbrand,int carquantity,double carprice,int showroomNo,String showroomadd)
	{
		this.carbrand= carbrand;
		this.carquantity= carquantity;
		this.carprice= carprice;
		this.showroomNo= showroomNo;
		this.showroomadd = showroomadd;
	}
	
	public void display()
	{
		System.out.println("Car name: "+carbrand+"\nCar Quantity: "+carquantity+"\nCar price: "+carprice+"L"+"\nShowroom Number: "+showroomNo+"\nShowroom address:"+showroomadd);
	}

	public static void main(String[] args) 
	{
		System.out.println("_________________________________________");
		Showroom sobj2 = new Showroom("Tata",1,50.50,2,"Mumbai");
		sobj2.display();
		sobj2.totalrevenue();
		System.out.println("_________________________________________");
		Showroom sobj3 = new Showroom("Tata",2,40.50,2,"Mumbai");
		sobj3.display();
		sobj3.totalrevenue();
		
	}

}
