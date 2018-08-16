package com.ibm.core;

public class task
{

	public static void main(String[] args) 
	{
				String uname=args[0];
				String pwd=args[1];
			if(uname.equals("abu"))
			{
				if(pwd.equals("1234"))
				{
				System.out.println("login success");
				}
				else
					System.out.println("please enter correct password");
				
			}
			else
				System.out.println("please enter valid username");		
	}
}
