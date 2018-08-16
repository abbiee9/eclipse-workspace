package com.stringclass;

public class StringBuffers 
{

	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("ibm");
		//s.append(" in manyata");
		System.out.println(s);
		StringBuffer s1=new StringBuffer("ibm");
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		StringBuffer s2=new StringBuffer("ibm");
		String s3=s1.toString();
		String s4=s2.toString();
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println(s.length());
		System.out.println(s.capacity());
		
		
		
		

	}

}
