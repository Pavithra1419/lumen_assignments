package com.assign.demo.apps;

import java.util.Scanner;

import com.assign.demo.Book;
import com.assign.demo.services.BookService;

public class BookApplication {

	public static void main(String[] args) {
		// first book
		Book book1=new Book(101,"The Alchemist","Paulo Coelho",699);
		BookService bs=new BookService();
		System.out.println("The details of the first Book;");
		System.out.println("--------------------------------------");
		System.out.println("Name: "+book1.getBname());
		System.out.println("Author: "+book1.getAuthor());
		System.out.println("ID :"+book1.getId());
		System.out.println("Initial Price: "+book1.getPrice());
		
		//based on customer type
		Scanner sc=new Scanner(System.in);
		System.out.println("Corporate or Retail?");
		String type=sc.next();
		System.out.println("Discounted price: "+bs.checkDiscount(book1,type));
		System.out.println();
		System.out.println();
		
		//second book
		Book book2=new Book(102,"Five Little Pigs","Agatha Christie",399);
		
		System.out.println("The details of the second Book;");
		System.out.println("--------------------------------------");
		System.out.println("Name: "+book2.getBname());
		System.out.println("Author: "+book2.getAuthor());
		System.out.println("ID :"+book2.getId());
		System.out.println("Initial Price: "+book2.getPrice());
		//based on price
		System.out.println("Discounted price: "+bs.checkDiscount(book1));
		
		sc.close();
		
		

	}

}
