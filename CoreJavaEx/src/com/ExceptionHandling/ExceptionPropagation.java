package com.ExceptionHandling;

public class ExceptionPropagation 
{
	void method3()
	{
		int result=100/0;
	}
	
	void method2()
	{
		method3();
	}
	
	void method1()
	{
		try
		{
			method2();
		}
		catch(Exception e)
		{
			System.out.println("exception is handled here");
		}
	}

	public static void main(String[] args)
	{
		ExceptionPropagation obj=new ExceptionPropagation();
		obj.method1();
		System.out.println("continue with normal flow");

	}

}
