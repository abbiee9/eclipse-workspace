package com.ScannerClass;
import java.util.Scanner;


public class ScannerEx
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String name=sc.next();
		System.out.println("Enter your empid: ");
		Integer eid=sc.nextInt();
		//String eid=sc.next();
		System.out.println("Enter your address: ");
		String loc=sc.next();
		System.out.println("gender M/F: ");
		String gender=sc.next();
		char gender1=gender.charAt(0);
		System.out.println("your complete info:  name " +name +" eid: "+eid +
				" address:  "+loc+"  gender: "+gender1);
		
	}

}