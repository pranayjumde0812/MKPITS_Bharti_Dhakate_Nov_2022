/*Write a program to read the value of an integer m and display the value
of m is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less
than 0. */
import java.util.Scanner;
class assignment_1FEB_10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int m=sc.nextInt();
		if(m>0)
		{
			m=1;
			System.out.println("m is "+m);
		}
		else if(m==0)
		{
			m=0;
			System.out.println("m is "+m);
		}
		else
		{
			m=-1;
			System.out.println("m is "+m);
		}
	}
}