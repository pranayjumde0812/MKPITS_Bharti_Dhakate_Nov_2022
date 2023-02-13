//Abstract method using for overriding
abstract class one1
{
	void dis()
	{
		System.out.println("Abstract class dis() fun called ");
	}
	abstract void absmethod();
}
class two extends one1
{
	void absmethod()
	{
		System.out.println("overridden function of abs class one1 ");
	}
}


public class abstract_class_method
{
	public static void main(String[] args)
	{
		two ob=new two();
		ob.dis();
		ob.absmethod();
	}
}

