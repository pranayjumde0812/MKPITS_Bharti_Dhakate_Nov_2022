class adddemo
{
	private int a,b;
	int res;

	void set(int x, int y)
	{
		a=x;
		b=y;
	}

	void sum(adddemo cob2, adddemo cob3)
	{
		res=a+cob2.a+cob3.a;
	}

	void dis(adddemo cob2, adddemo cob3)
	{
		System.out.print("ob1.a + ob2.a + ob3.a => ");
		System.out.println(a+ " + " +cob2.a+ " + " +cob3.a+ " = " +res);
	}
}

public class Object_As_Argument
{
	public static void main(String[] args)
	{
		adddemo ob1=new adddemo();
		adddemo ob2=new adddemo();
		adddemo ob3=new adddemo();
		ob1.set(12,3);
		ob2.set(22,4);
		ob3.set(20,5);
		ob1.sum(ob2,ob3);
		ob1.dis(ob2,ob3);
	}
}

