package com.oopsctr;

public class Book 
{
	public String title,author;
	public int price;
	
	public Book()
	{
		System.out.println("Inside default constructor..");
		this.title = "Data structure";
		this.author = "Narsimha Kurumanchi";
		this.price = 670;
	}
	
	public Book(String title,String author)
	{
		System.out.println("Inside 1st parameterised constructor");
		this.title = title;
		this.author = author;
	}
	
	public Book(String title,String author,int price)
	{
		System.out.println("Inside 2nd parameterised constructor");
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void display()
	{
		System.out.println("Title of book is:"+this.title+"\nAuthor is:"+this.author+"\nPrice is:"+this.price);
	}
	
	public String toString()
	{
		return "\nTitle of book is:"+this.title+"\nAuthor is:"+this.author+"\nPrice is:"+this.price;
	}

	public static void main(String[] args) 
	{
		Book bobj = new Book();
		bobj.display();
		System.out.println("_________________________________________________");
		Book bobj1 =new Book("C Programming","Denies Ritchie");
		bobj1.display();
		System.out.println("_________________________________________________");
		Book bobj2 = new Book("Java Programming","James Goslingh",756);
		bobj2.display();
		System.out.println("_________________________________________________");
		Book bobj3 = new Book("C# Programming","Anders Hejlsberg",987);
		System.out.println("By using toString:"+bobj3);
	}

}
