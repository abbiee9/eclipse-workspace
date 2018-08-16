package com.EncapsulationAbstraction;

public class Test 
{

	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.setEid(123);
		System.out.println(e.getEid());
		e.setName("Abu");
		System.out.println(e.getName());
		
		int i=e.setAtmpin(1);

		if(i>=1)
		{
			System.out.println("success");
		}
		else
			System.out.println("access denaied");
	}

}
