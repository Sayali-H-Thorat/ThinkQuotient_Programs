package com.oops.basic;

class e_Details
{
	private int e_id,dept_No,sal,netSal,pf,hra,da;
	private String e_name,email;
	
	public void setData(int emp_id,String e_Name,int dept_no,int e_Sal,String e_mail)
	{
		e_id = emp_id;
		e_name = e_Name;
		dept_No = dept_no;
		sal = e_Sal;	
		email = e_mail;
	}
	public int getEid()
	{
		return e_id;
	}
	public void setEid(int eid)
	{
		e_id = eid;
	}
	public String getEname()
	{
		return e_name;
	}
	public void setEname(String name)
	{
		e_name = name;
	}
	public int getDeptno()
	{
		return dept_No;
	}
	public void setDeptno(int dno)
	{
		dept_No = dno;
	}
	public int getNetsal()
	{
		return netSal;
	}
	public void setNetsal(int sal)
	{
		netSal = sal;
	}
	public int getSal()
	{
		return sal;
	}
	public void setSal(int salary)
	{
		sal = salary;
	}
	public int getPf()
	{
		return pf;
	}
	public void setPf(int pf1)
	{
		pf = pf1;
	}
	public int getDa()
	{
		return da;
	}
	public void setDa(int Da)
	{
		da = Da;
	}
	public int getHra()
	{
		return hra;
	}
	public void setHra(int Hra)
	{
		hra = Hra;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String mail)
	{
		email = mail;
	}
	public void display()
	{
		System.out.println("Emp name is:"+ e_name+"\nemp id is:"+e_id+"\ndept No is:"+dept_No+"\nEmail id is:"+email+"\nSalary is:"+sal+"\nPf is:"+pf+"\nhra is:"+hra+"\nda is:"+da+"\nNet salary is:"+netSal);	
	}
	public void calculateSal()
	{
		pf = sal*10 /100;
				
		hra = sal*15/100;
		
		da = sal*20/100;
	
		netSal = sal - pf+hra+da;
		
//		System.out.println("Pf is:"+pf+"\nhra is:"+hra+"\nda is:"+da+"\nNet Salary is:"+netsal);
	}
}

public class Employee
{

	public static void main(String[] args)
	{
		e_Details eobj = new e_Details();
		eobj.setData(101,"Sayali",501,10000,"abc@gmail.com");
		eobj.calculateSal();
		eobj.display();

	}

}
