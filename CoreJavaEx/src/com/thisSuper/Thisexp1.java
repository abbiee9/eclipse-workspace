package com.thisSuper;

class A1
{
	A1()
	{
		this(1,2);
		System.out.println("A class constructor");
	}
	A1(int a, int b)
	{
		
		System.out.println(a+b);
	}
	static void m1()
	{
		System.out.println("m1 method");
	}
	static void m2()
	{
		System.out.println("m2 method");
	}
}

	public class Thisexp1
	{
		public static void main(String[] args) 
	{
			A1.m1();
			A1.m2();
			A1 a2=new A1(2,3);
			A1 a1=new A1();
	}
	}
