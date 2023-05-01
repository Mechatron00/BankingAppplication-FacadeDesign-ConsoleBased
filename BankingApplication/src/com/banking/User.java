package com.banking;

import java.util.Scanner;

public class User 
{
	private Bank bank;
	void menu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name:");
		String name=sc.nextLine();
		System.out.println("Enter customer ID:");
		int id=sc.nextInt();
		bank=new Bank(name,id);
		char option;
		
//		System.out.println("Welcome "+this.bank.customerName);
//		System.out.println("Customer ID:"+this.bank.customerId);
//		System.out.println("\n");
//		System.out.println("a)Check Balance");
//		System.out.println("b)Deposite");
//		System.out.println("c)Withdraw");
//		System.out.println("d)Check Previous Transaction");
//		System.out.println("e)Exit");
		System.out.println("Welcome "+this.bank.customerName);
		System.out.println("Customer ID:"+this.bank.customerId);
		
		
		do
		{
			
			System.out.println("\n");
			System.out.println("a)Check Balance");
			System.out.println("b)Deposite");
			System.out.println("c)Withdraw");
			System.out.println("d)Check Previous Transaction");
			System.out.println("e)Exit");
			
			
			
			System.out.println("******************************************************");
			System.out.println("Choose an option");
			option=sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
				case 'a':
					System.out.println("...................................");
					System.out.println("Balance:"+this.bank.bal);
					System.out.println("...................................");
					break;
				
					
					
				case 'b':
					System.out.println("...................................");
					System.out.println("Enter amount to deposite:");
					System.out.println("...................................");
					double amt=sc.nextDouble();
					this.bank.deposite(amt);
					System.out.println("\n");
					break;
					
				case 'c':
					System.out.println("...................................");
					System.out.println("Enter amount to Withdraw:");
					System.out.println("...................................");
					double amtW=sc.nextDouble();
					this.bank.withdraw(amtW);
					System.out.println("\n");
					break;
				
				case 'd':
					System.out.println("...................................");
					System.out.println("Previous Transaction:");
					this.bank.getPreviousTransaction();
					System.out.println("...................................");
					
					System.out.println("\n");
					break;
					
				case 'e':
					System.out.println("Thank you for banking with us!");
					System.out.println("...................................");
					break;
					
				default:
					System.out.println("choose correct option to proceed!");
					break;
			}
		}
		while(option != 'e');
		System.out.println("Have a nice day...");
		
	}
}
