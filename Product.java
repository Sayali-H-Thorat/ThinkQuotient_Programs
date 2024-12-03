package com.oopsctr;

public class Product 
{
	private int pid;
	public String pname;
	public int pprice;
	
	public Product()
	{
		System.out.println("By using default constructor:");
		pid = 101;
		pname = "Bag";
		pprice = 570;
	}
	public Product(int pid, String pname, int pprice)
	{
		System.out.println("By using parameterised constructor:");
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		
	}
	public void display()
	{
		System.out.println("Product id is:"+this.pid+"\nProduct name is:"+this.pname+"\nProduct Price is:"+this.pprice);
	}

	public static void main(String[] args) 
	{
		
		Product pobj = new Product();
		pobj.display();
		
		System.out.println("______________________________");
		
		Product pobj1 = new Product(101,"Watch",2500);
		pobj1.display();
		
		

	}

}
