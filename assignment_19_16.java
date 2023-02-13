/* Write a program to find the larger value from two positive integer
values that is in the range 20..30 inclusive, or return 0 if neither is in
that range.*/
import java.util.Scanner;
public class assignment_19_16
{
	public int value()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two positive integer number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>=20 && x<=30 && y>=20 && y<=30)
		{
			if(x>y)
			{
				System.out.println(x+" is greater than "+y);
			}
			else
			{
				System.out.println(y+" is greater than "+x);
			}
		}
		else
		{
			System.out.println("Not in range");
			return 0;
		}
		return 0;
	}

	public static void main(String[] args)
	{
		assignment_19_16 ob=new assignment_19_16();
		ob.value();
	}
}

