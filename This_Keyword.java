class thisdemo
{
	int b;
	void set(int b)
	{
		this.b=b;
	}
	void dis()
	{
		System.out.println(b);
	}
}
public class This_Keyword
{
	public static void main(String[] args)
	{
		thisdemo ob1 = new thisdemo();
		thisdemo ob2 = new thisdemo();
		thisdemo ob3 = new thisdemo();

		ob1.set(2);
		ob2.set(5);
		ob3.set(9);
		ob1.dis();
		ob2.dis();
		ob3.dis();
	}
}
