package com.oopsctr;

public class Employee 
{
	int eid;
	String ename;
	double sal;
	static String cName;
	
	static
	{
		System.out.println("Inside static block 1");
		cName = "Infosys";
	}
	static
	{
		System.out.println("Inside static block 2");
	}
	public static void changecname(String name)
	{
		cName = name;
	}
	
	public Employee()
	{
		
	}
	public Employee(int eid,String ename,double sal)
	{
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	
	public void show()
	{
		System.out.println("Eid is:"+eid+"\nEName is:"+ename+"\nSal is:"+sal+"\nCompany name:"+cName);
	}

	public static void main(String[] args) 
	{
		System.out.println("Inside main function");
		Employee e = new Employee();
		e.show();
		System.out.println("_______________________________");
		Employee e1 = new Employee(101,"Vedika",40000);
		e1.show();
		System.out.println("________________________________");
		Employee.changecname("Infosys ltd");
		e1.show();
		

	}

}
