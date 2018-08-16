package com.Collection.List;

import java.util.ArrayList;

import java.util.ListIterator;

public class ListIteratorEx
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("abu");
		al.add("talha");
		al.add("siddiqi");
		al.add("abbiee");
		al.add("shaikh");
		System.out.println(al);
		ListIterator li=al.listIterator();
		
		while(li.hasNext())          //in farword direction
		{
			String st=(String) li.next();
			if(st.equals("talha"))
			{
				li.remove();
			}
			else
				System.out.println(st+" ");
		}
		
		while(li.hasPrevious())     //in backword direction
		{
			String st=(String) li.previous();
			if(st.equals("siddiqi"))
			{
				li.remove();
			}
			else
			System.out.println(st+" ");
		}
	}
}
		
		