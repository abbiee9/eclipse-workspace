package com.Multihreading;

class B implements Runnable
{
	public void run()
	{
		
		System.out.println(Thread.currentThread());
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Thread.currentThread().setName("child thread");
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("child thread");
		}
	}
}
public class ThreadMethods 
{

	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread());
		Thread.currentThread().setPriority(5);
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("main thread");
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		B b=new B();
		Thread t=new Thread(b);
		t.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("main thread");
		}
	}

}
