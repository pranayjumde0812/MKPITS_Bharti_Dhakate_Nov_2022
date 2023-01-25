/* Write a program to get the absolute difference between n and 51. If n is greater than 51
return triple the absolute difference.*/
import java.util.Scanner;
class assignment_19_6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		float n = sc.nextFloat();
		float d = 51-n;
		if(n<=51)
		{
			System.out.println("The absolut difference between 51 and "+n+" is "+d);
		}
		else
		{
			d=Math.abs(d);
			System.out.println("The absolut difference between 51 and "+n+" is "+d*3);
		}
	}
}