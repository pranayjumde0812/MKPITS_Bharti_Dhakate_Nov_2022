/*Write a program to check if one given temperatures is less than 0 and
the other is greater than 100.*/
import java.util.Scanner;
public class assignment_19_10
{
	public static boolean value()
	{
		Scanner sc=new Scanner(System.in);
		boolean check = false;
		System.out.println("Enter the two temperatures");
		float tem1=sc.nextFloat();
		float tem2=sc.nextFloat();
		if(tem1<0 && tem2>100 || tem1>100 && tem2<0)
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