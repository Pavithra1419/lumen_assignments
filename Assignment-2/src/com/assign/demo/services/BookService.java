package com.assign.demo.services;

import com.assign.demo.Book;

public class BookService {
	//this overloaded method calculates discount based on price
	public double checkDiscount(Book bk)
	{   double tprice;
		if(bk.getPrice()<500)
		{
			tprice=(bk.getPrice()-(bk.getPrice()*0.15));
		}
		else
		{
			tprice=(bk.getPrice()-(bk.getPrice()*0.25));
		}
		return tprice;
	}
	//this method calculates discount based on customer type
	public double checkDiscount(Book bk, String ctype)
	{  
		double tprice1;
		if(ctype.equalsIgnoreCase("corporate"))
		{
			tprice1=(bk.getPrice()-(bk.getPrice()*0.25));	
		}
		else {
			tprice1=(bk.getPrice()-(bk.getPrice()*0.15));
			
		}
		return tprice1;
		
	}


}
