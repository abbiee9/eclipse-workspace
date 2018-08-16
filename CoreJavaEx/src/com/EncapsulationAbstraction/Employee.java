package com.EncapsulationAbstraction;

public class Employee 
{
	private int eid;
	private String name;
	private int atmpin;
	
	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid = eid;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public int setAtmpin(int atmpin) 
	{
		this.atmpin = atmpin;
		return atmpin;
	}
	

}

/*	public int setAtmpin(int atmpin)
{
	
	this.atmpin = atmpin;
return atmpin;

}*/
