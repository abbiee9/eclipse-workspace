package com.Multihreading;

class A1
{
	public  void display(String msg)
	{
		System.out.print("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("]");
	}
}
class B1 extends Thread
{
	String msg;
	A1 a;//has-a
	B1(A1 fp, String str)
	{
		a=fp;
		msg=str;
		this.start();
	}
	public void run()
	{
		a.display(msg);
	}
}
public class SynchronisedMethodIns
{

	public static void main(String[] args)
	{
		A1 fnew=new A1();
		B1 ss=new B1(fnew,"welcome");
		B1 ss1=new B1(fnew,"new");
		B1 ss2=new B1(fnew,"java programmer");
	}

}
