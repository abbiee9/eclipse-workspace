package com.ExceptionHandling;
import java.util.Scanner;

public class UsingScannerClass
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value for devision: ");
		int a=sc.nextInt();
		System.out.println("Enter second value for devision: ");
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println("devision is: " +c);
		}
		catch(Exception e)
		{
			System.out.println("do not enter zero as denominator");
		}
		System.out.println("remaining 1000 lines");
	}

}
