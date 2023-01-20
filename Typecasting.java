public class Typecasting
{
	public static void main(String[] args)
	{
		byte a=2;
		short s=a;	//Implicit casting byte to short i.e. from small data-type to large data-type

		long l=12345;
		a=(byte)l;  //Explicit typecasting long to short
		System.out.println("the result is "+s);
		System.out.println("the result is "+a);

		long t=12;
		byte c=(byte)t;
		System.out.println("the result is "+c);
	}
}
