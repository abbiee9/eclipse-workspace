package com.ExceptionHandling;

public class MultipleExceptionUsingFinally
{
	public static void main(String agrs[]) 
	{
		try
		{
			
			try
			{
			int a=10;
			int b=0;
			int c=a/b;
			}
			catch(ArithmeticException aee)
				{
					System.out.println("do not enter zero as denomenator");
				}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			finally
			{
				System.out.println("connection closed");
			}
			int arr[]= {1,2,3,4};
			arr[9]=10;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("connection2 closed");
		}
		
		System.out.println("print remaining lines");
	}

}
