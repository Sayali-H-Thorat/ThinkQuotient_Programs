package com.oopsctr;

import java.util.Scanner;

public class MathMethods 
{
	public int iNo;
	
	public MathMethods()
	{
		iNo = 3;
	}
	public MathMethods(int iNo)
	{
		this.iNo = iNo;
	}
	
	public int square()
	{
		int iResult = 0;
		iResult = iNo*iNo;		
		return iResult;
	}
	
	public int cube()
	{
		int iResult = 0;
		iResult = iNo*iNo*iNo;
		return iResult;
	}
	
	public void power()
	{
		Scanner sobj = new Scanner(System.in);
		
		int iCnt = 0,iResult=1;
		System.out.println("Enter the power:");
		int power = sobj.nextInt();
		for(iCnt = 1;iCnt<=power;iCnt++)
		{
			iResult= iResult*iNo;
		}
		System.out.println(iNo+" raised to "+power+" is: "+iResult);
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int iNo = sobj.nextInt();
		
		MathMethods mobj = new MathMethods(iNo);
		int iAns = mobj.square();
		System.out.println("Square of "+iNo+" is: "+iAns);
		
		MathMethods mobj1 = new MathMethods(iNo);
		iAns = mobj1.cube();
		System.out.println("Cube of "+iNo+" is: "+iAns);
		
		MathMethods mobj2 = new MathMethods(iNo);
		mobj2.power();

	}

}
