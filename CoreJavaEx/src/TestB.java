class TestA
{
	public void start()
	{
		System.out.println("TestA");
	}
}

public class TestB extends TestA 
{
	
	int a=10;//global
	int b=30;
	public void start() 
	{
		//int a=20;//local
		System.out.println(a+b);
		System.out.println("TestB");
	}

	public static void main(String[] args) 
	{
		((TestA) new TestB()).start();
	}
}