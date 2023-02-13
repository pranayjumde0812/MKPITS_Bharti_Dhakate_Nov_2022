/* interface one     class two
			\			/
			  \		   /
			class three */



interface one
{
	void dis();

	void absmethod();
}

class two
{
	void set()
	{
		System.out.println("I am in super class");
	}

}

class three extends two implements one
{
	public void dis()
	{
	}
	public void absmethod()
	{
		System.out.println("overridden function of abstract class one");
	}

}

public class interfacing3
{
	public static void main(String[] args)
	{
		three ob=new three();
		ob.absmethod();
		ob.set();
	}
}
