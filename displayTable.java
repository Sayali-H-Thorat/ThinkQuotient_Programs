package dowhile;

import java.util.Scanner;

public class displayTable 
{
	public static void table(int No)
	{
		System.out.println("Table for "+No+" is:");
		
		for(int iCnt = 1; iCnt <=10;iCnt++)
		{
			System.out.println(No+"*"+iCnt+" = "+iCnt * No);
		}		
		
	}

	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number to print table:");
		int iNo = sobj.nextInt();
		
		table(iNo);
		
		sobj.close();

	}

}
