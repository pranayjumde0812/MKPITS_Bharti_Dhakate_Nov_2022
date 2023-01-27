/*Write a program to check whether three given integer values
are in the range 20..50 inclusive. Return true if 1 or more of
them are in the said range otherwise return false.*/
import java.util.Scanner;
public class assignment_19_12
{
	public static boolean value()
	{
		Scanner sc=new Scanner(System.in);
		boolean check = false;
		System.out.println("Enter the three integer numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=20 && a<=50 || b>=20 && b<=50 || c>=20 && c<=50 )
		{
			check=true;
		}
		return check;
	}

	public static void main(String[] args)
	{
		System.out.println(value());
	}
}
