package com.oopsctr;

public class BookStatic 
{
	int bid;
	String bname,aname;
	static String bpublication;
	
	
	public BookStatic()
	{
		System.out.println("Inside default constructor.");
		bname = "The monk who sold his ferrari";
		bid=101;
		aname="Robin Sharma";
		bpublication="Jaico publications";
	}
	public BookStatic(int bid,String bname,String aname,String bpublication)
	{
		System.out.println("Inside parameterised constructor.");
		this.bid=bid;
		this.bname= bname;
		this.aname=aname;
		bpublication= bpublication;	
	}
	public int getBid()
	{
		return bid;
	}
	public void setBid(int b_id)
	{
		bid = b_id;
	}
	public String getBname()
	{
		return bname;
	}
	public void setBname(String b_nm)
	{
		bname = b_nm;
	}
	public String getAname()
	{
		return aname;
	}
	public void setAname(String a_nm)
	{
		aname = a_nm;
	}
	public String getBpublication()
	{
		return bpublication;
	}
	public void setBpublication(String b_pb)
	{
		bpublication = b_pb;
	}
	
	public void display()
	{
		System.out.println("Book name: "+bname+"\nBook id: "+bid+"\nBook author: "+aname+"\nBook publication: "+bpublication);
	}

	public static void main(String[] args) 
	{
		BookStatic bobj= new BookStatic();
		bobj.display();

		System.out.println("_________________________________________________________________________");
		BookStatic bobj1 = new BookStatic(501,"Lifes amazing secret","Gaur Gopal Das","Pigeon publications");
		bobj1.display();

	}

}
