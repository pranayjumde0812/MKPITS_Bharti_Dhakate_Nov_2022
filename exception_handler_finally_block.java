public class exception_handler_finally_block
{
	public static void main(String[] args)
	{
		int a=2;
		int c=0;
		System.out.println("Start Program");
		try{
			c=a/0;
		} catch(ArithmeticException e)
		{
			System.out.println("Exception Generated");
		}
		finally{
			System.out.println("Finally block executed");
		}
		System.out.println("End Program "+c);

	}
}