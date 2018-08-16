package com.pdw.packages1;
import com.pdw.packages.*;
public class Welcome1 extends Welcome
{
	public void m2()
	{
		m6();
		System.out.println("HelloWorld");
	
	}
}
class Test
{

	public static void main(String[] args) 
	{
		Welcome w=new Welcome();
		Welcome1 w1=new Welcome1();

	}

}
