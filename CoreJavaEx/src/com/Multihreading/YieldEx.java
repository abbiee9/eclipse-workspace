package com.Multihreading;

class Producer extends Thread 
{

	public void run()
	{
		for (int i = 0; i < 10; i++)
			
		{
			Thread.yield();

			System.out.println("Producer :Produced Item" + i);
		}
	}
}

class Consumer extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++)
			
		{
			Thread.yield();
			System.out.println("Consume: Consumed Item" + i);
		}

	}
}

public class YieldEx 
{

public static void main(String[] args)
{
Producer producer=new Producer();
Consumer consumer =new Consumer();
producer.setPriority(Thread.MIN_PRIORITY);
consumer.setPriority(Thread.MAX_PRIORITY);
producer.start();
consumer.start();

}
}