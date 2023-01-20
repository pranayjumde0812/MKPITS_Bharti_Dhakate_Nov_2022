class adddemo
{
	private int a,b;

	void set(int x, int y)
	{
		a=x;
		b=y;
	}

	adddemo sum(adddemo cob2, adddemo cob3)      //we have write written type of object
	{
		adddemo tob=new adddemo();
		tob.a=a+cob2.a+cob3.a;
		tob.b=b+cob2.b+cob3.b;
		return tob;
	}

	void dis(adddemo cob2, adddemo cob1, adddemo cob3)
	{
		System.out.print("ob1.b + ob2.b + ob3.b => ");
		System.out.println(cob1.b+ " + " +cob2.b+ " + " +cob3.b+ " = " +b);
		System.out.print("ob1.a + ob2.a + ob3.a => ");
		System.out.println(cob1.a+ " + " +cob2.a+ " + " +cob3.a+ " = " +a);
	}
}

public class Object_As_ReturnType
{
	public static void main(String[] args)
	{
		adddemo ob1=new adddemo();
		adddemo ob2=new adddemo();
		adddemo ob3=new adddemo();
		adddemo ob4=new adddemo();
		ob1.set(12,3);
		ob2.set(22,4);
		ob3.set(20,5);
		ob4=ob1.sum(ob2,ob3);
		ob4.dis(ob2,ob1,ob3);
	}
}

