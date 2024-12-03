package com.oops.basic;

public class TestDate {

	public static void main(String[] args) 
	{
		//here we create object of a MyDate class and access the method setData() and display()
		MyDate mobj4=new MyDate();
//		mobj4.dd = 11; is not allowed ad data members are private and accessible within same class
		mobj4.setData(20, 11,2017);
		mobj4.display();

	}

}
