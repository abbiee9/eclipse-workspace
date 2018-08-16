class A1 
{
	void foo() throws Exception {
		throw new Exception();
	}
}

class SubB2 extends A1 {
	void foo()  {
		System.out.println("B ");
	}
}

class Vvimp1 {
	public static void main(String[] args) {
		A1 a = new SubB2();
		try {
		a.foo();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}