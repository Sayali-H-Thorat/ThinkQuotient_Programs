package com.oopsctr;

public class BookCtr 
{
	String bname,aname,btype,bpublication;
	int bid,bprice;
	
	public BookCtr()
	{
		System.out.println("Inside default constructor.");
		bname = "The monk who sold his ferrari";
		bid=101;
		aname="Robin Sharma";
		btype="Fiction";
		bpublication="Jaico publications";
		bprice= 268;
	}
	public BookCtr(int b_id,String b_name,String a_name,String b_type,String b_publication,int b_price)
	{
		System.out.println("Inside parameterised constructor.");
		bid=b_id;
		bname= b_name;
		aname=a_name;
		btype=b_type;
		bpublication= b_publication;	
		bprice=b_price;
	}
	public void display()
	{
		System.out.println("Book name: "+bname+"\nBook id: "+bid+"\nBook author: "+aname+"\nBook type: "+btype+"\nBook publication: "+bpublication+"\nBook price: "+bprice);
	}

	public static void main(String[] args) 
	{
		BookCtr bobj= new BookCtr();
		bobj.display();

		System.out.println("_________________________________________________________________________");
		BookCtr bobj1 = new BookCtr(501,"Lifes amazing secret","Gaur Gopal Das","Self-Help","Pigeon publications",170);
		bobj1.display();
	}

}
