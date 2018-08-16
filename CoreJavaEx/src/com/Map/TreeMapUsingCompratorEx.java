package com.Map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapUsingCompratorEx 
{

	public static void main(String[] args)
	{
		TreeMap tm = new TreeMap(new MyComparator1());
		tm.put(1, "Sandeep");
		tm.put(3, "Dileep");
		tm.put(2, "Srikanth");
		tm.put(4, "Abu");
		System.out.println(tm);
		
	}

	
}

class MyComparator1 implements Comparator 
{
	public int compare(Object o1,Object o2) 
	{ 
		String s1=o1.toString(); 
		String s2=o2.toString(); 
		//return -s1.compareTo(s2); 
		//return s1.compareTo(s2); 
		return s2.compareTo(s1); 
	}
}
