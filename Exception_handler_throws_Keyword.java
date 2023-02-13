class Exception_handler_throws_Keyword
{
	public static void main(String[] args)throws InterruptedException
	{
		System.out.println("Start Program");
		Thread.sleep(1000);
		System.out.println("End Program");
	}
}

/*If we do not write "throws IneterruptionException" , then error will occur    =>
error : C:\Users\hp\Desktop\java\Exception_handler_throws_Keyword.java:6: error: unreported exception InterruptedException; must be caught or declared to be thrown
		Thread.sleep(1000);
		            ^
		1 error*/