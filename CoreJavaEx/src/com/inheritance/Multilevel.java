package com.inheritance;

class A
{
	public void m1()
	{
		System.out.println(" a class m1 methods");
	}
	public void m2()
	{
		System.out.println(" a class m2 methods");
	}
}
class B extends A
{
	public void m3()
	{
		System.out.println(" b class m3 methods");
	}
	public void m4()
	{
		System.out.println(" b class m4 methods");
	}
}
class Multilevel extends B
{
	
	public static void main(String[] args)
	{
		Multilevel t=new Multilevel();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
	}

}

