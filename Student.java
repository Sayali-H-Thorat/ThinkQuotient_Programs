package com.oops.basic;

public class Student
{
	private int rollno;
	private String name,grade;
	private int m1,m2,m3,m4,m5,total;
	private double percentage;
	
	public Student()
	{
		System.out.println("Inside default constructor");
		rollno=201;
		name= "Shivani";
		m1= 95;
		m2=99;
		m3=89;
		m4=90;
		m5=90;
	}
	public void setData(int rno,String nm,int s1,int s2,int s3,int s4,int s5)
	{
		rollno = rno;
		name = nm;
		m1=s1;
		m2=s2;
		m3=s3;
		m4=s4;
		m5=s5;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rno)
	{
		rollno = rno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String nm)
	{
		name = nm;
	}
	public int getM1()
	{
		return m1;
	}
	public void setM1(int M1)
	{
		m1 = M1;
	}
	public int getM2()
	{
		return m2;
	}
	public void setM2(int M2)
	{
		m2 = M2;
	}
	public int getM3()
	{
		return m3;
	}
	public void setM3(int M3)
	{
		m3 = M3;
	}
	public int getM4()
	{
		return m4;
	}
	public void setM4(int M4)
	{
		m4 = M4;
	}
	public int getM5()
	{
		return m5;
	}
	public void setM5(int M5)
	{
		m5 = M5;
	}
	public double getPercentage()
	{
		return percentage;
	}
	public void setPercentage(double per)
	{
		percentage = per;
	}
	public int getTotal()
	{
		return total;
	}
	public void setTotal(int tl)
	{
		total = tl;
	}
	public String getGrade()
	{
		return grade;
	}
	public void setGrade(String gd)
	{
		grade =gd;
	}
	public void display()
	{
		System.out.println("Rollno: "+rollno+"\nName:"+name+"\nsubject1:"+m1+"\nSubject2:"+m2+"\nsubject3:"+m3+"\nsubject4:"+m4+"\nsubject5:"+m5+"\nTotal:"+total+"\nPercentage:"+percentage+"\nGrade:"+grade);
	}
	
	public String toString()
	{
		return "Rollno: "+rollno+"\nName:"+name+"\nsubject1:"+m1+"\nSubject2:"+m2+"\nsubject3:"+m3+"\nsubject4:"+m4+"\nsubject5:"+m5+"\nTotal:"+total+"\nPercentage:"+percentage+"\nGrade:"+grade;
	}

	public void calculatepercentage()
	{
		total = m1+m2+m3+m4+m5;
		percentage = (100*total)/500;
	}
	public void calculateGrade()
	{
		if(percentage >= 90)
			grade = "A1";
		else if(percentage <90 && percentage >=80)
			grade="A2";
		else if(percentage <80 && percentage >=70)
			grade="B1";
		else if(percentage <80 && percentage >=60)
				grade="B2";
		else if(percentage <60 && percentage >=50)
			grade="C1";
		else if(percentage <50 && percentage >=40)
			grade="C2";
		else
			grade="F";
	}

	public static void main(String[] args) 
	{
		Student sobj=new Student();
		sobj.calculatepercentage();
		sobj.calculateGrade();
		sobj.display();
		System.out.println("________________________");
		sobj.setData(1, "Sahil", 55, 67, 78, 95, 50);
		sobj.calculatepercentage();
		sobj.calculateGrade();
		sobj.display();
		System.out.println("________________________");
//		Student sobj1=new Student();
//		sobj1.setData(2, "Sanika", 55, 49, 70, 78, 98);
//		sobj1.calculatepercentage();
//		sobj1.calculateGrade();
//		sobj1.display();
//		System.out.println("________________________");
//		

	}

}
