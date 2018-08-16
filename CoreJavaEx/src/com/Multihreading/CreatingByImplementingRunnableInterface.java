package com.Multihreading;

class A implements Runnable
{
	public void run()
	{
		
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("child thread");
		}
	}
}
public class CreatingByImplementingRunnableInterface 
{

	public static void main(String[] args)
	{
		
		A a=new A();
		Thread t=new Thread(a);
		t.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("main thread");
		}
	}

}
