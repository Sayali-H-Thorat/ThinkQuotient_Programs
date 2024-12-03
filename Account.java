package com.oopsctr;

public class Account 
{
	int accid;
	String name;
	double balance;
	static double interestRate,year;
	
	static
	{
		System.out.println("inside static init block 1");
		interestRate = 11.5;
		year = 2;
	}
	public static void changeinterestRate(double rate)
	{
		interestRate = rate;
	}
	public Account()
	{
		System.out.println("inside default constructor.");
	}
	public Account(int accid,String name,double balance)
	{
		this.accid = accid;
		this.name = name;
		this.balance =balance;
	}
	public void display()
	{
		System.out.println("Acc id is:"+accid+"\nAcc holder name:"+name+"\nAccount balance:"+balance+"\nRate of interest is:"+interestRate);
	}
	
//	@Override
	public String toString()
	{
		return "\nAcc id is:"+accid+"\nAcc holder name:"+name+"\nAccount balance:"+balance+"\nRate of interest is:"+interestRate;
	}
	
	public void deposit(int amount)
	{
		if(amount > 0)
		{
			balance = balance +amount;
			System.out.println("Deposited amount is:$"+amount);
		}
		else
		{
			System.out.println("Amount must be greater than zero");
		}
	}
	public void withdraw(double amount)
	{
		if(amount > 0)
		{
			if(amount <= balance)
			{
				balance = balance - amount;
				System.out.println("Withdrawal of:$"+amount);
			}
			else
			{
				System.out.println("Insufficient account balance. Withdrawal failed");
			}
		}
	}
	public void calculateInterest()
	{
		double rate = (interestRate*balance*year)/100;
		System.out.println("Rate of interest on amt is:"+rate);
	}

	public static void main(String[] args) 
	{		
		Account ac = new Account();
		ac.display();
		
		System.out.println("______________________________");
		Account ac1 = new Account(34242,"Neha",8400);
		ac1.display();
		System.out.println("_______________________________");
		ac1.deposit(5000);
		ac1.display();
		System.out.println("_______________________________");
		ac1.withdraw(500);
		ac1.display();
		ac1.calculateInterest();
		System.out.println("_______________________________");
		Account.changeinterestRate(11);
		ac1.display();
		ac1.calculateInterest();
		System.out.println("________________________________");
		Account ac2 = new Account(3421,"Sahil",8579);
		System.out.println("By using toString :"+ac2);
	}

}
