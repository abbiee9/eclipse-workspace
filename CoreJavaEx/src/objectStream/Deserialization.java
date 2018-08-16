package objectStream;
import java.io.*;

public class Deserialization {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("student.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s1=(Student)ois.readObject();//typecast from parent class object to our class object
		System.out.println(s1.getSno());
		System.out.println(s1.getName());
		System.out.println(s1.getAddr());
		
	}

}

