package com.Multihreading;

class Xyz extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("child thread");
		}
	}
}
public class CreatingByExtendingThread
{

	public static void main(String[] args)
	{
		Xyz x=new Xyz();
		x.start();
		//x.run();//normal method call
		for(int i=0;i<=5;i++)
		{
			System.out.println("main thread");
		}
	}

}
