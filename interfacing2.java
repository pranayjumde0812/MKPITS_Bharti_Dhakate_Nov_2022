/* interface one     interface two
	\			/
	\		   /
	   class three */



interface one
{
	void dis();

	void absmethod();
}

interface two
{
	void dis();

	void absmethod();
}

class three implements one,two
{
	public void dis()
	{
	}
	public void absmethod()
	{
		System.out.println("overridden function of abstract class one");
	}

}

public class interfacing2
{
	public static void main(String[] args)
	{
		three ob=new three();
		ob.absmethod();
	}
}
