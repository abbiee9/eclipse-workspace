package com.Collection.Set;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetComparatorEx 
{

	public static void main(String[] args) 
	{
		TreeSet hs=new TreeSet(new MyComparator1());
		hs.add(1);
		hs.add(2);
		hs.add(5);
		hs.add(3);
		hs.add(4);
		hs.add(1000);
		hs.add(2);
		System.out.println(hs);
		
		
		
	}
}
class MyComparator1 implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		/*if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else
			return 0;*/
		return i2.compareTo(i1);
		
	}
}