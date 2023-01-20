class do_while1
{
	public static void main(String[] args)
	{
		int n=5,sum=0;
		do
		{
			sum += n;
			n--;
		}
		while(n>0);

			System.out.println("Addition of 1 upto 5 is "+sum);
	}
}
