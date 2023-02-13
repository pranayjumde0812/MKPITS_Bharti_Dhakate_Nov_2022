//Final using for overriding
class one1
{
	final void logic()
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


public class final_overriding_function
{
	public static void main(String[] args)
	{
		final int a=2;
		System.out.println(a);
		two ob=new two();
	}
}

