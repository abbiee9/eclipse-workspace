package com.Collection.List;

import java.util.Enumeration;
import java.util.Stack;

public class StackEx 
{

	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.push("Abu");
		s.push("Talha");
		s.push("Siddiqi");
		s.push(1);
		System.out.println(s);
		Enumeration e=s.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			
		}
		System.out.println(s.pop());
		System.out.println(s);
		/*System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.search("waerafsegfdfaswraeww"));
		System.out.println(s.search("Talha"));*/
		
		
		
		

	}

}
