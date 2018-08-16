package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapEx 
{

	public static void main(String[] args)
	{
		Map hashmapObject=new HashMap();
		Map weakhashmapObject=new WeakHashMap();
		
		String hashmapkey=new String("Abu");
		String weakhashmapkey=new String("Abbiee");
		
		String hashmapvalue=new String("Talha");
		String weakhashmapvalue=new String("Shaikh");
		
		hashmapObject.put(hashmapkey, hashmapvalue);
		weakhashmapObject.put(weakhashmapkey, weakhashmapvalue);
		
		System.out.println("HashMap before garbage collected: "+hashmapObject);
		System.out.println("WeakHashMap before garbage collected:"+weakhashmapObject);
		
		hashmapkey=null;
		weakhashmapkey=null;
		
		System.gc();
		
		System.out.println("HashMap after garbage collected: "+hashmapObject);
		System.out.println("WeakHashMap after garbage collected:"+weakhashmapObject);
		
		
		
		
		
		
		
	}

}
