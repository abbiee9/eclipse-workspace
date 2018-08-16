
public class Module1 
{
	public static void main(String[] args)
	{
		int i,sum;
		sum=10;
		try
		{
		for(i=-1;i<5;i++)
		{
			sum=(sum)/(i);
			System.out.println(i);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
