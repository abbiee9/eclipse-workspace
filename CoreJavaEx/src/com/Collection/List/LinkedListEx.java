package com.Collection.List;

import java.util.LinkedList;

public class LinkedListEx 
{

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add("a");
		ll.add(1);
		ll.add("aa");
		ll.add("as");
		ll.add("aaa");
		ll.add("aa");
		ll.add("aaaa");
		ll.add("afg");
		ll.add(0, null);
		System.out.println(ll);
		
		ll.addFirst("abu");
		System.out.println(ll);
		ll.addLast("Siddiqi");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll);
		System.out.println(ll.removeLast());
		System.out.println(ll);
	}

}
