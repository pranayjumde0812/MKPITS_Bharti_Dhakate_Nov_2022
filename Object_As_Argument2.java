class adddemo
{
	private int a,b;
	int res;

	void set(int x, int y)
	{
		a=x;
		b=y;
	}

	void sum(adddemo cob2, adddemo cob1)
	{
		res=b+cob2.b+cob1.b;
	}

	void dis(adddemo cob2, adddemo cob1)
	{
		System.out.print("ob1.b + ob2.b + ob3.b => ");
		System.out.println(cob1.b+ " + " +cob2.b+ " + " +b+ " = " +res);
	}
}

public class Object_As_Argument2
{
	public static void main(String[] args)
	{
		adddemo ob1=new adddemo();
		adddemo ob2=new adddemo();
		adddemo ob3=new adddemo();
		ob1.set(12,3);
		ob2.set(22,4);
		ob3.set(20,5);
		ob3.sum(ob2,ob1);
		ob3.dis(ob2,ob1);
	}
}

