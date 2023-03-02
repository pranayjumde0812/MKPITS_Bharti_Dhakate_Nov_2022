/*     1
      3	3
     5 5 5
    7 7 7 7
   9 9 9 9 9 */
class Number_Pattern
{
	public static void main(String[] args)
	{
		System.out.println("Number Pattern : ");
		for(int h=1;h<=9;h++)
		{
			if(h%2==0)
			continue;
			for(int space=1;space<=41-h;space++)
			{
				System.out.print(" ");
			}
			for(int n=1;n<=h;n=n+2)
			{
				System.out.print("   "+h);
			}
			System.out.println();
		}
	}
}