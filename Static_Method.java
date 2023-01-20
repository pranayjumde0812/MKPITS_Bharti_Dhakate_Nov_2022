class add
{
	int a;
	static int b;
	static void set()
	{
		b++;
		// a=2; //static method can access only static variable
	}
	void dis()
	{
		System.out.println(b);
	}
}
public class Static_Method
{
	public static void main(String[] args)
	{
		add ob1 = new add();
		add ob2 = new add();
		add ob3 = new add();
		ob1.dis();
		ob2.dis();
		ob3.dis();
		ob1.set();  //calling using object
		add.set();  //calling using class-name
		ob1.dis();
		ob2.dis();
		ob3.dis();
	}
}
