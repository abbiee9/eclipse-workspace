package com.abstractclass;
class abc
{
	 void m1()
	 {
		 System.out.println("asxax");
	}
	void m2() 
	{
	}
	void m3()
	{
		System.out.println("task1 class m3 method");
	}
	
}
class task1 extends abc
{
	/*void m1()
	{
		System.out.println("task class m1 method");
	}
	void m2()
	{
		System.out.println("task class m2 method");
	}*/
	
	void m4()
	{
		System.out.println("task1 class m4 method");
	}
}
class Abstractexp extends task1
{
	public static void main(String[] args)
	{
		Abstractexp t=new Abstractexp();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
	}
}