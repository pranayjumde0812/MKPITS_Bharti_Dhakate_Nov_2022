public class Exception_handler
{
	public static void main(String[] args)
	{
		int a=2;
		int c=0;
		System.out.println("Start Program");

		//Normal Program
		/*c=a/2;
		System.out.println("End Program "+c);
		Output : Start Program
						End Program 1*/

		//Exception Program
		/*System.out.println("Start Program");
		c=a/0;
		System.out.println("End Program "+c);
		Output : Start Program
					Exception in thread "main" java.lang.ArithmeticException: / by zero
        			at Exception_handler.main(Exception_handler.java:15)*/

        //To handle the Exception
       /* try{
			c=a/0;
		} catch(ArithmeticException e)                      ['e' is an object for the exception which is thrown by try block]
		{
			System.out.println("Exception Generated");
		}
		System.out.println("End Program "+c);
		Output : Start Program
					Exception Generated
					End Program 0 */

		//Exception Handler block that is try and catch without any exception occuring in program
		try{
			c=a/3;
		} catch(ArithmeticException e)
		{
			System.out.println("Exception Generated");
		}
		System.out.println("End Program "+c);

	}
}
