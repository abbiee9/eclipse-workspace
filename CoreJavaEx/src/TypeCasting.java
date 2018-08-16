public class TypeCasting
{
    public static void main(String[] args)
    {
      Double d = 100.04;  
      long l = (long) d.doubleValue(); //explicit type casting required  
      int i = (int) l;                 //explicit type casting required  
      System.out.println("Double value " + d);
      System.out.println("Long value " + l);
      System.out.println("Int value " + i);
    }
}