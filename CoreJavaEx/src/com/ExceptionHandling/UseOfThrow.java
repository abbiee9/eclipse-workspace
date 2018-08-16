package com.ExceptionHandling;

class MyException1 extends Exception
{
	private int age1;
	public MyException1(int age)
	{
		age1=age;
	}
	public String toString()
	{
		return "you are not eligible for vote: "+age1; //to get the value of e ...naturally jvm create this toString() but as we are creating the exception we need to create it
		
	}
}

public class UseOfThrow
{
	static void validation(int age) throws MyException1
	{
		if(age<18)
			throw new MyException1(age);
		else
			System.out.println("you are eligible for vote");
	}

	public static void main(String[] args)
	{
		try
		{
			validation(16);
		}
		catch(MyException1 e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}
		System.out.println("rest of the code...");

	}

}
