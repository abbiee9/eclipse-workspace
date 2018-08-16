package com.Map;

import java.util.Collection;
import java.util.TreeMap;

public class TreeMapEx 
{

	public static void main(String[] args)
	{
		TreeMap tm = new TreeMap();
		tm.put(4, "Abu");
		tm.put(1, "Sandeep");
		tm.put(2, "Dileep");
		tm.put(3, "Srikanth");
		
		System.out.println(tm);
		Collection c=tm.values();
		System.out.println(c);
		
		System.out.println(tm.keySet());
		System.out.println(tm.entrySet());
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.headMap(3));
		System.out.println(tm.tailMap(3));
		System.out.println(tm.subMap(2, 4));
	}

	
}
