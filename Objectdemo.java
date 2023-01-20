class adddemo
{
	int a=5,b=7;
	int res;
	void sum()
	{
		res=a+b;
	}
	void dis()
	{
		System.out.println("the sum is "+res);
	}
}

public class Objectdemo
{
	public static void main(String[] args)
	{
		adddemo ob = new adddemo();
		ob.sum();
		ob.dis();
	}
}