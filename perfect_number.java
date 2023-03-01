/*Check whether the number is perfect number or not */
import java.util.Scanner;
class perfect_number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check if its perfect number or not : ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=(num/2);i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}

		if(sum==num)
		{
			System.out.println(num+" is a perfect number");
		}
		else
		{
			System.out.println(num+" is not a perfect number");
		}
	}
}
