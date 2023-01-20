//Assignment 18 jan 2023 (Question 7)
class Prime
{
	public static void main(String[] args)
	{
		System.out.println("the prime numbers between 1 to 200 :");
		for(int i=2;i<=200;i++)
		{
			int count = 0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				count++;
			}
			if(count==2) /*no.of divisor is count and since prime number is only divided by two number which are 1 and the number itself then
							 the count should always be 2.*/
			{
				System.out.print(i+", ");
			}
		}
		System.out.println();
	}
}
