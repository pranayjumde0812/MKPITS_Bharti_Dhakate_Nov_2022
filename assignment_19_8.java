/*Write a program to check a given integer and return true if
it is within 10 of 100 or 200*/
import java.util.Scanner;
public class assignment_19_8
{
	public static boolean value()
		{
			Scanner sc=new Scanner(System.in);
			boolean check = false;
			System.out.println("Enter the integer number");
			int a=sc.nextInt();
			int x=Math.abs(100-a);
			int y=Math.abs(200-a);
			if(x<=10 || y<=10)
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


