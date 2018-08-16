package com.ExceptionHandling;

public class NullPointExceptionHandling 
{

	public static void main(String[] args) 
	{
		String s=null;
		try
		{
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("null value will not have a length");
		}
		System.out.println("print remaining lines of code");

	}

}
