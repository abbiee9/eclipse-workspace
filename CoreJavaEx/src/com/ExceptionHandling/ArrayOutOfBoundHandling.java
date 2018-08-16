package com.ExceptionHandling;

public class ArrayOutOfBoundHandling 
{

	public static void main(String[] args)
	{
		int a[]=new int[5];
		a[0]=1;
		try
		{
		a[5]=1;
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			ai.printStackTrace();
			//System.out.println(ai.getMessage());
			 
			
		}
		System.out.println("print remaining lines of code");


	}

}
