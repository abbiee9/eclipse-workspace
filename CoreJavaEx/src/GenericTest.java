public class GenericTest<G> 
{
	G g;

	GenericTest(G g) 
	{
		this.g = g;
	}

	public static void main(String[] args)
	{
		GenericTest<String> arr[] = new GenericTest[5]; // line 1
		arr[0] = new GenericTest("Java"); // line 2
		arr[1] = new GenericTest(1); // line 3
		arr[2] = (GenericTest<String>) new GenericTest(1); // line 4
		arr[3] = (GenericTest<String>) new GenericTest<Integer>(1); // line 5
		for (GenericTest o : arr)
		{
			System.out.println(o);
		}
	}
}