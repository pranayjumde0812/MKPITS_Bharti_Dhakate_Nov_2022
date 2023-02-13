/* Write a program to check which number nearest to the value 100
among two given integers. Return 0 if the two numbers are equal. */
import java.util.Scanner;
public class assignment_19_14
{
	public int value()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integer number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a1=Math.abs(x-100);
		int a2=Math.abs(y-100);
		if(x==y)
		{
			System.out.println("0");
			return 0;
		}
		else if(a1>a2)
		{
			System.out.println(y+" is nearest to 100");
		}
		else
		{
			System.out.println(x+" is nearest to 100");
		}
		return 0;
	}

	public static void main(String[] args)
	{
		assignment_19_14 ob=new assignment_19_14();
		ob.value();
	}
}

