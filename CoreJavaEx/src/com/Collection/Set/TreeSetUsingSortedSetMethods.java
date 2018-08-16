package com.Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetUsingSortedSetMethods 
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
		System.out.println(hs.first());
		System.out.println(hs.last());
		System.out.println(hs.headSet(3));//before 3 varialble will be printed
		System.out.println(hs.tailSet(3));//after 3 variable will be printed including 3
		System.out.println(hs.subSet(2, 5));//store between 2 to 5 but include 2 as well
		System.out.println(hs.comparator());
		System.out.println(hs.floor(10000));
		System.out.println(hs.lower(3));
		

	}

}

