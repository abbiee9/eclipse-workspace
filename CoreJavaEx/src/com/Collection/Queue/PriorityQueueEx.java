package com.Collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueueEx
{

	public static void main(String[] args)
	{
		PriorityQueue pq=new PriorityQueue();
		pq.add(1);
		pq.add(2);
		pq.add(4);
		pq.add(3);
		pq.add(2);
		pq.offer(80);
		//pq.add("abu");
		System.out.println(pq);
		System.out.println(pq.remove(2));
		System.out.println(pq);
		


	}

}
