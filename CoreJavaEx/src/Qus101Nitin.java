
class A
{
	static String str1 = "STRING_IN_A";
}

class B extends A 
{
	static String str1 = "STRING_IN_B";
}
 class Qus101Nitin
 {
		public static void main(String[] args)
			{
			
		
					B b1 = new B();
					System.out.println(b1.str1);
			}
}
