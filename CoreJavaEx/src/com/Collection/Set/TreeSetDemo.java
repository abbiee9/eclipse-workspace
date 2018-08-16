package com.Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDemo 
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
		/*Integer i=new Integer(2);
		Integer i1=new Integer(12);
		System.out.println(i.compareTo(i1));//-1*/
		/*Integer i=new Integer(12);
		Integer i1=new Integer(2);
		System.out.println(i.compareTo(i1));//1*/
		Integer i=new Integer(2);
		Integer i1=new Integer(2);
		System.out.println(i.compareTo(i1));//0
		System.out.println("a".compareTo("b"));//-1
		int x=9;
		System.out.println((char)x);
		
		
		
	}
}