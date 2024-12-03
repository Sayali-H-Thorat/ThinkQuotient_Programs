package com.oopsctr;

public class EmployeeIdAutoGenerate 
{
	int eid;
	String ename,depname;
	double sal;
	static int autoid;
	
	public EmployeeIdAutoGenerate()
	{
		ename = "Gauri";
		depname = "IT";
		sal = 50000;
	}
	public EmployeeIdAutoGenerate(String ename,String depname,double sal)
	{
		this.ename = ename;
		this.depname= depname;
		this.sal = sal;
	}
	public void display()
	{
		System.out.println("Employee id:"+autoid+"\nName:"+ename+"\ndepartment name:"+depname+"\nSalary:"+sal);
	}
	public static int generateAutoId()
	{
		autoid=autoid+1;
		return autoid;
	}

	public static void main(String[] args)
	{
		EmployeeIdAutoGenerate eobj= new EmployeeIdAutoGenerate();
		EmployeeIdAutoGenerate.generateAutoId();
		eobj.display();
		System.out.println("_____________________________________________");
		EmployeeIdAutoGenerate eobj1= new EmployeeIdAutoGenerate("Shrutika","IT",50000);
		EmployeeIdAutoGenerate.generateAutoId();
		eobj1.display();
		System.out.println("_____________________________________________");
		EmployeeIdAutoGenerate eobj2= new EmployeeIdAutoGenerate("Sneha","Science",89600);
		EmployeeIdAutoGenerate.generateAutoId();
		eobj2.display();
		System.out.println("_____________________________________________");		

	}

}
