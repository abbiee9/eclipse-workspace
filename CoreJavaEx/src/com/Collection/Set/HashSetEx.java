package com.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx 
{

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(1000);
		hs.add(2000);
		System.out.println(hs);
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}

