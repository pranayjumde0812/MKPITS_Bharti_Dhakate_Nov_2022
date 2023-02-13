/* interface one
		|
		|
		|
		|
	class two */



interface one
{
	void dis();

	void absmethod();
}

class two implements one
{
	public void dis()
	{
	}
	public void absmethod()
	{
		System.out.println("overridden function of abstract class one");
	}

}

public class interfacing
{
	public static void main(String[] args)
	{
		two ob=new two();
		ob.absmethod();
	}
}
