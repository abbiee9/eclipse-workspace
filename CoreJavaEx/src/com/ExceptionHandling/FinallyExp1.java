package com.ExceptionHandling;

public class FinallyExp1
{

	public static void main(String[] args) 
	{
		try
		{
			
			try
			{
				System.out.println("devision");
				int b=30/2 ;
				
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae);
			}
			try
			{
				int a[]=new int[3];
				a[3]=4;
			}
			catch(ArrayIndexOutOfBoundsException ai)
			{
				System.out.println(ai);
			}
			System.out.println("remaining try statements");
			int c=12/0;
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		finally
		{
			System.out.println("will always execute");
		}
		System.out.println("normal execution");
	}

}
