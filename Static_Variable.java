class add
{
	static int b;
	void set()
	{
		b++;
	}
	void dis()
	{
		System.out.println(b);
	}
}
public class Static_Variable
{
	public static void main(String[] args)
	{
		add ob1 = new add();
		add ob2 = new add();
		add ob3 = new add();
		ob1.dis();
		ob2.dis();
		ob3.dis();
		add.b=12;
		ob1.dis();
		ob2.dis();
		ob3.dis();
	}
}
