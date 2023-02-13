/*Write a Java  program that takes four numbers as input to calculate and
print the average.  */
import java.util.Scanner;
class assignment_1FEB_03
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 4 numbers you want to find the average");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		float avg=(float)(a+b+c+d)/4;
		System.out.println("Average is "+avg);
	}
}