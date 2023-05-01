package com.banking;

public class Bank  implements Banking
{
	 	double bal;
	    double prevTrans;
	    String customerName;
	    int customerId;
	    
	    
		public Bank(String customerName, int customerId)
		{
		
			this.customerName = customerName;
			this.customerId = customerId;
		}


		@Override
		public void deposite(double amount) 
		{
			if(amount !=0)
			{
				bal += amount;
				prevTrans=amount;
			}
			
		}


		@Override
		public void withdraw(double amount) 
		{
			if(amount != 0 && bal > amount)
			{
				bal  -= amount;
				prevTrans =- amount;
			}
			else if(bal < amount)
			{
				System.out.println("Insufficient funds!");
			}
		}


		@Override
		public void getPreviousTransaction() 
		{
			if(prevTrans > 0)
			{
				System.out.println("Deposited:"+prevTrans);
			}
			else if(prevTrans < 0)
			{
				System.out.println("Withdrawn:"+Math.abs(prevTrans));
			}
			else
			{
				System.out.println("No transactions to show!");
			}
			
		}
	    
		
		
}
