
package com.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("a");
		al.add("x");
		al.add("s");
		al.add("a");
		al.add("z");
		al.add("b");
		al.add(3, "i");
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			String ch=(String) it.next();
			if(ch.equals("x"))
					{
						it.remove();
					}
			else
					System.out.println(ch);
		}
		/*Object[] a=al.toArray();
		System.out.println(a[1]);*/
		ArrayList<String> al1=new ArrayList<String>();
		System.out.println(al);
		//System.out.println(al.indexOf("a"));
		al1.add("a1");
		al1.add("x1");
		al1.add("s1");
		al1.add("a1");
		al1.add("z1");
		al1.add("b1");
		al1.add(3, "i1");
		System.out.println(al1);
		System.out.println(al1.addAll(al));
		System.out.println(al1);
		//System.out.println(al1.removeAll(al));
		//System.out.println(al1.retainAll(al));
		//al.clear();
		//System.out.println(al);
		//al1.remove("i1");//list interface
		//al1.remove(3);// collection interface
		//System.out.println(al1.containsAll(al));
		//System.out.println(al.size());
		//System.out.println(al1.size());
		//al1.add(0,"abu");
		//al1.addAll(0,al);
		//System.out.println(al1);
		//System.out.println(al1.isEmpty());
		//System.out.println(al1.get(0));
		//System.out.println(al1.remove(0));
		//System.out.println(al1);
		System.out.println(al1.set(0, "talha"));//it will replace 
		System.out.println(al1);
		System.out.println(al1.indexOf("a"));
		System.out.println(al1.lastIndexOf("a"));
		System.out.println(al1);
		System.out.println(al);
		System.out.println(al1.retainAll(al));
		
		
			
	}

}
