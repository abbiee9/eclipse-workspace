package com.ExceptionHandling;

public class NumberFormatExceptionHandling
{

	public static void main(String[] args) 
	{
		String s="xyz";
		try
		{
		int a=Integer.parseInt(s);
		System.out.println(a);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("convert the type to char");
		}
		System.out.println("print remaining lines of code");
	}

}
