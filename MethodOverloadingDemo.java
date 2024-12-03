package com.oopsctr;

public class MethodOverloadingDemo 
{
	public static void add(int i,int j)
	{
		System.out.println("Addition of int,int");
		System.out.println("Addition is:"+(i+j));
		System.out.println("__________________________");
	}
	public static void add(int i,double d)
	{
		System.out.println("Addition of int,double");
		System.out.println("Addition is:"+(i+d));
		System.out.println("__________________________");
	}
	public static void add(int i,int j,int k)
	{
		System.out.println("Addition of int,int,int");
		System.out.println("Addition is:"+(i+j+k));
		System.out.println("__________________________");
	}
	
	public static void substract(int i,int j)
	{
		System.out.println("substraction of int,int");
		System.out.println("substraction is:"+(i-j));
		System.out.println("__________________________");
	}
	public static void substract(int i,double d)
	{
		System.out.println("substraction of int,double");
		System.out.println("substraction is:"+(i-d));
		System.out.println("__________________________");
	}
	public static void substract(int i,int j,int k)
	{
		System.out.println("substraction of int,int,int");
		System.out.println("substraction is:"+(i-j-k));
		System.out.println("__________________________");
	}
	

	public static void main(String[] args) 
	{
		add(12,2);
		add(10,2.5);
		add(10,2,9);
		
		substract(12,2);
		substract(10,2.5);
		substract(10,2,9);
	}

}
