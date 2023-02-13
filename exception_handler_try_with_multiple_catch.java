public class exception_handler_try_with_multiple_catch
{
	public static void main(String[] args)
	{
		int a=2;
		int c=0;
		int b[]={1,2,3,4};
		System.out.println("Start Program");
		try{
			c=a/0;
			for(int i=0;i<=b.length;i++)
			{
				System.out.println(b[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception Generated");
		}
		 catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Generated");
		}
		finally{
			System.out.println("Finally block executed");
		}
		System.out.println("End Program "+c);

		System.out.println();
		System.out.println();

		try{
			for(int i=0;i<=b.length;i++)
			{
				System.out.println(b[i]);
			}
			c=a/0;
		} catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception Generated");
		}
		 catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Generated");
		}
		finally{
			System.out.println("Finally block executed");
		}
		System.out.println("End Program "+c);

	}
}