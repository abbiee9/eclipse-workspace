package com.ExceptionHandling;

import java.util.Scanner;

class MyException2 extends Exception
{
	private int mark1;
	public MyException2(int mark)
	{
		mark1=mark;
	}
	public String toString()
	{
		return "you passed the examination with distiction: "+mark1; 
	}
}
class MyException3 extends Exception
{
	private int mark2;
	public MyException3(int mark)
	{
		mark2=mark;
	}
	public String toString()
	
	{
		return "you just passed the examination: "+mark2; 
	}
}


public class UseOfThrowMultipleTimesForCreatingException
{
	static void abu(int mark) throws MyException2, MyException3
	{
		if(mark>80)
			throw new MyException2(mark);
		else if(mark>40)
			throw new MyException3(mark);
		else
			System.out.println(" you failed the examination");
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Integer a=sc.nextInt();
		try
		{
			abu(a);
		}
		catch(MyException2|MyException3 e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}
		System.out.println("rest of the code...");

	}

}
