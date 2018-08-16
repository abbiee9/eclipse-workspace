package com.ExceptionHandling;

public class WithExceptionHandling
{
	static int c;
	public static void main(String[] args)
	{
		try
		{
			int a=10;
			int b=0;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception abu)
		{
			System.out.println("do not enter zero as denomenator");
		}
		System.out.println(c);//will take default value of c 
		System.out.println("print remaining line of code");

	}


}
