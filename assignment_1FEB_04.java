/* Write a Java  program to that takes three numbers(x,y,z) as input and
print the output of (x+y).z and x.y + y.z. */
import java.util.Scanner;
class assignment_1FEB_04
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 integer numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int a=(x+y)*z;
		int b=(x*y)+(y*z);
		System.out.println("Output of (x+y).z : "+a);
		System.out.println("Output of x.y + y.z : "+b);


	}
}