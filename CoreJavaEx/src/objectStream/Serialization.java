package objectStream;
import java.io.*;
class Student implements Serializable
{
	private int sno;
	private String name;
	private transient String addr;
	public int getSno()
	{
		return sno;
	}
	public void setSno(int sno) 
	{
		this.sno = sno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddr()
	{
		return addr;
	}
	public void setAddr(String addr)
	{
		this.addr = addr;
	}
	
}

public class Serialization 
{

	public static void main(String[] args) throws Exception
	{
		Student student=new Student();
		student.setSno(402);
		student.setName("Abu");
		student.setAddr("Allahabad");
		FileOutputStream fos=new FileOutputStream("student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(student);
	}

}
