class SPEEDdemo
{
	int d=173,t=40;
	double s;
	void speed()
	{
		s = (double)d/t;
	}
	void dis()
	{
		System.out.println("the Speed is "+s);
	}
}

public class ObjectSpeed
{
	public static void main(String[] args)
	{
		SPEEDdemo ob = new SPEEDdemo();
		ob.speed();
		ob.dis();
	}
}