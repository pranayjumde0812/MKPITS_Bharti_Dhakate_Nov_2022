class adddemo
{
	int a=3,b=7;
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

public class ObjectReference
{
	public static void main(String[] args)
	{
		adddemo ob = new adddemo();
		ob.sum();
		ob.dis();

		adddemo ob2 = ob;
		ob2.dis();

		//change ob2
		ob2.a=12;
		System.out.println("the value of a is "+ob.a);
		ob2.dis();
		System.out.println("the address of ob  is "+ob);
	}
}

