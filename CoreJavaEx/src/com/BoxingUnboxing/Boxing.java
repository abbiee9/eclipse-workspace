
package com.BoxingUnboxing;

public class Boxing 
{

	public static void main(String[] args) 
	{
		int a=10;
		
		//boxing
		Integer a1=new Integer(a);
		a1.valueOf(a);
		//Integer a1=Integer.valueOf(a);
		System.out.println("boxing from primitive to wrapper: " +a1);
		
		//auto boxing
		Integer a2=a;
		System.out.println(" auto boxing a2 value is: "+a2);
		
		
		//un-boxing
		Integer i=new Integer(20);
		int x=i.intValue();
		//int x=i.valueOf(i);
		System.out.println("unboxing from  wrapper to primitive: "+x);
		
		//auto-unboxing
		int y=i;
		System.out.println("auto unboxing: "+y);
		

	}

}
