package com.oopsctr;

public class BillCalculation 
{
	int pprice,pquantity,pdiscount,pgst;
	
	public static void calculatebill(int pprice,int pquantity)
	{
		System.out.println("Product price: "+pprice);
		System.out.println("Product quantity: "+pquantity);
		int TotalCost = pprice*pquantity;
		System.out.println("Total bill is:"+ TotalCost);
		System.out.println("____________________________");
	}
	public static void calculatebill(int pprice,int pquantity,int pdiscount)
	{
		System.out.println("Product price: "+pprice);
		System.out.println("Product quantity: "+pquantity);
		System.out.println("Discount on product: "+pdiscount+"%");
		int TotalCost = pprice*pquantity;  //Total cost of product
		int discountamt =TotalCost*pdiscount/100;   //Total discount calculated
		int finaldiscount= TotalCost - discountamt;  //final discount amount
		System.out.println("Discount on bill is:"+finaldiscount);	
		System.out.println("____________________________");
	}

	public static void calculatebill(int pprice,int pquantity,int pdiscount,int pgst)
	{
		System.out.println("Product price: "+pprice);
		System.out.println("Product quantity: "+pquantity);
		System.out.println("Discount on product: "+pdiscount+"%");
		System.out.println("GST is:"+pgst+"%");
		int TotalCost = pprice*pquantity;  //Total cost of product
		int discountamt =TotalCost*pdiscount/100;   //Total discount calculated
		int finaldiscount= TotalCost - discountamt; //Discount amount 
		int gstamt = finaldiscount*pgst/100;     //calculate gst
		int finalgst = finaldiscount+gstamt;   //final gst on discounted amt
		System.out.println("GST on bill is: "+finalgst);
		System.out.println("Total Payable amount is: "+finalgst);
		System.out.println("____________________________");
	}


	public static void main(String[] args)
	{
		calculatebill(500,2);
		calculatebill(500,2,10);
		calculatebill(500,2,10,2);
	}

}
