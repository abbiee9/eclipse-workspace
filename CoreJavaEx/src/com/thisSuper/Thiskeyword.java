package com.thisSuper;

public class Thiskeyword 
{
	int a=10;
	int b=20;
	void m1(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}

	public static void main(String[] args)
	{
		Thiskeyword t=new Thiskeyword();
		t.m1(30, 40);
				

	}

}
