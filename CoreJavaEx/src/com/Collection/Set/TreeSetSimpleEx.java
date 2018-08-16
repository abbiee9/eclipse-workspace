package com.Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetSimpleEx 
{

	public static void main(String[] args) 
	{
		TreeSet hs=new TreeSet();
		hs.add(1);
		hs.add(2);
		hs.add(5);
		hs.add(3);
		hs.add(4);
		hs.add(1000);
		hs.add(2);
		System.out.println(hs);
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

		
	}

}

