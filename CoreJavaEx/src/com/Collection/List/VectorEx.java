
package com.Collection.List;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.addElement("Abu");
		v.addElement("Talha");
		v.addElement("Siddiqi");
		v.addElement("Abbiee");
		v.addElement("Shaikh");
		v.addElement(1);
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			
		}
		System.out.println(v.capacity());//10
		System.out.println(v.size());
		Vector v1=new Vector();
		v1.addElement("Abu1");
		v1.addElement("Talha1");
		v1.addElement("Siddiqi1");
		v1.addElement("Abbiee1");
		v1.addElement("Shaikh1");
		v1.addElement(2);
		System.out.println(v1);
		System.out.println(v.addAll(v1));
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
	}

}
