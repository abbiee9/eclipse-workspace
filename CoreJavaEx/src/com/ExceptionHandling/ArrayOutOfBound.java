package com.ExceptionHandling;

public class ArrayOutOfBound
{

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		//int a[]={1,2,3,4,5};
		a[0]=1;
		a[5]=1;
		System.out.println(a[5]);

	}

}
