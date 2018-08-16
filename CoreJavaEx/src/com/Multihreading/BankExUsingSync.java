package com.Multihreading;

class Account
{
	public int balance;//5000
	public Account()
	{
		balance=5000;
		
	}
	public synchronized void withdraw(int bal)//500
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		balance=balance-bal;//4500
		System.out.println("Amount Withdrawn= "+bal);
		System.out.println("New Balance= "+balance);
		
	}
	public synchronized void deposit(int bal)//1000
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		balance=balance+bal;//5500
		System.out.println("Amount deposited= "+bal);
		System.out.println("New Balance= "+balance);
		
	}
	public synchronized void enquiry()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Available Balance= "+ balance);
		
	}
}

class Transaction implements Runnable
{
	Account obj;//has-a relationship
	Transaction(Account a)
	{
		obj=a;
	}
	public void run()
	{
		obj.withdraw(500);
		obj.deposit(1000);
		obj.enquiry();
	}
}
public class BankExUsingSync
{

	public static void main(String[] args)// throws InterruptedException
	{
		 Account a=new Account();
		 Transaction w1=new Transaction(a);//has-a relationship to use the method of account class in transaction
		 //so using 'a' we can access anything in transaction class
		 Thread t1=new Thread(w1);//to call start method for creating thread
		 Thread t2=new Thread(w1);
		 t1.start();// so it will check run method
		//t1.join();
		 t2.start();
		
		

	}

}
