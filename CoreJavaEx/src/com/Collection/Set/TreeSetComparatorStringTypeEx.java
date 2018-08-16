package com.Collection.Set;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetComparatorStringTypeEx 
{

	public static void main(String[] args) 
	{
		TreeSet hs=new TreeSet(new MyComparator2());
		hs.add("a");
		hs.add("d");
		hs.add("c");
		hs.add("b");
		hs.add("z");
		hs.add("a");
		hs.add("z");
		/*hs.add("abau");
		hs.add("talha");
		hs.add("atalha");
		hs.add("abtalha");
		hs.add("siddiqi");*/
	
		
		System.out.println(hs);
		
		
		
	}
}
class MyComparator2 implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String i1=o1.toString();
		String i2=(String) o2;
		return -i1.compareTo(i2);
		//return i2.compareTo(i1);
		//return i1.compareTo(i2);
		
	}
}