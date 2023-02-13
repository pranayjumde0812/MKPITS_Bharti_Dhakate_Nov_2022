/* interface one
	|
	|
   interface two
   	|
   	|
   class three */

interface one
{
	void dis();

	void absmethod();
}

interface two extends one
{
	void dis1();

	void absmethod();
}

class three implements two
{
	public void dis()
	{
	}
	public void absmethod()
	{
		System.out.println("overridden function of abstract class one");
	}
	public void dis1()
	{
		System.out.println("overridden function of abstract class 2");
	}

}

public class interfacing4
{
	public static void main(String[] args)
	{
		three ob=new three();
		ob.absmethod();
		ob.dis1();

	}
}
