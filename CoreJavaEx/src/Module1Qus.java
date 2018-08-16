import java.io.*;

class Myclass implements Serializable

{

	String s;

	int i;

	double d;

	Myclass(String s, int i, double d)

	{

		this.d = d;

		this.i = i;

		this.s = s;

	}

}

class Module1Qus

{

	public static void main(String[] args)

	{

		try

		{

			Myclass object1 = new Myclass("Hello", -7, 2.1e10);

			FileOutputStream fos = new FileOutputStream("serial");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(object1);

			oos.flush();

			oos.close();

		}

		catch (Exception e)

		{

			System.out.println("Serialization" + e);

			System.exit(0);

		}

		try

		{

			int x;

			FileInputStream fis = new FileInputStream("serial");

			ObjectInputStream ois = new ObjectInputStream(fis);
			x = ois.readInt();

			System.out.println(x);

		}

		catch (Exception e)

		{

			System.out.print("deserialization");

			System.exit(0);

		}

	}

}