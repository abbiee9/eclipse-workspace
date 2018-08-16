package com.Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesEx 
{

	public static void main(String[] args) throws Exception
	{
		Properties p=new Properties();
		
		FileInputStream fi=new FileInputStream("welcome.properties");
		p.load(fi);
		
		System.out.println(p);
		String s=p.getProperty("pwd");
		System.out.println(s);
		
		p.setProperty("name", "abu123");
		
		FileOutputStream fo=new FileOutputStream("welcome.properties");
		p.store(fo, "update using properties class");
		

	}

}
