package com.ExceptionHandling;

class cal
{
	public void div(String a, String b) throws ArithmeticException, NumberFormatException
	{
		int c=Integer.parseInt(a)/Integer.parseInt(b);
		System.out.println(c);
	}
}


public class ThrowsExp 
{

	public static void main(String[] args) 
	{
		cal ob=new cal();
		try
		{
			ob.div("2","0");
		}
		catch(ArithmeticException|NumberFormatException e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("devide by zero");
		}
		catch(NumberFormatException e)
		{
			System.out.println("enter only int value");
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}*/
	}

}
