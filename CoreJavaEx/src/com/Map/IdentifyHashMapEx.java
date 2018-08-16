package com.Map;

import java.util.IdentityHashMap;

public class IdentifyHashMapEx 
{

	public static void main(String[] args) 
	{
		IdentityHashMap i=new IdentityHashMap();//take as == to check duplicate value
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		i.put(i1, "abu");
		i.put(i2,"talha");
		
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2);//internally it treat as == so it check for reference so both value will be printed
		System.out.println(i);

	}
	

}
