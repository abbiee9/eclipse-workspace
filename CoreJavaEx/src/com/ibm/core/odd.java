package com.ibm.core;

public class odd
{

	public static void main(String[] args) 
	
		{
			int a=Integer.parseInt(args[0]);
			int sum=0;
			int d;
			for(d=0;d<=a;d++)
			{
				if(d%2!=0)
				{
					sum=sum+d;
				}
				
			}
			System.out.println(sum);
		}
}
