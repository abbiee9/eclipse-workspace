package com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapEx 
{

	public static void main(String[] args) 
	{
		LinkedHashMap hm=new LinkedHashMap();
		hm.put("sandeep", 100);
		System.out.println(hm);
		Object o=hm.put("sandeep", 2);
		System.out.println(o+" " +hm.size());

		HashMap hm1=new HashMap();
		hm1.putAll(hm);
		System.out.println(hm1);
		hm.put("dikleep", 4);
		hm.put("abu",3);
		hm.put("talha",3);
		hm.put("Siddiqi",3);
		hm.put("talha",3);
		System.out.println(hm);
		/*Set s=hm.keySet();//will take only keys
		System.out.println(s);
		Set s1=hm.entrySet();//will take both values and key
		System.out.println(s1);
		Collection c=hm.values();//will take values only
		System.out.println(c);*/
		
		
		/*Iterator i=s1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		
		
		
		

	}

}
