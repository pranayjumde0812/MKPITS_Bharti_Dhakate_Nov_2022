final class one1
{
	void logic1()
	{
		System.out.println("final class");
	}
}
class two extends one1
{
	void logic()
	{
		System.out.println("subclass");
	}
}


public class final_inheritance_class
{
	public static void main(String[] args)
	{
		final int a=2;
		System.out.println(a);
		two ob=new two();
	}
}

