package com.ExceptionHandling;

public class FinallyExp 
{

	public static void main(String[] args) 
	{
		try
		{
			int arr[]= {1,2,3,4};
			arr[5]=10;
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(" give the correct size");
		}
		finally
		{
			System.out.println("connection closed");
		}
		System.out.println("print remaining lines");

	}

}
