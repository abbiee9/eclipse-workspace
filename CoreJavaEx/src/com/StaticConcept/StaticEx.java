package com.StaticConcept;

public class StaticEx
{
int eid;
String name;
static String comname;
StaticEx(int i,String n) 
{
	eid=i;
	name=n;
}
public void show()
{
	System.out.println(eid+ "  "+name + " "+comname);
}
	public static void main(String[] args) 
	{
		StaticEx.comname="IBM";
		StaticEx se=new StaticEx(1,"Abu");
		StaticEx se1=new StaticEx(2,"Dileep");
		StaticEx se2=new StaticEx(3,"Abbiee");
		se.show();
		se1.show();
		se2.show();
	}

}
