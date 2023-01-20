import java.util.Scanner;
class one
{
	int logic()
	{
		int count=0,sum=0,min,max;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the positive number :");
				int a=sc.nextInt();
				if(a<=0)
				{
					System.out.println("No Positive number entered");
					return 0;
				}
				min=a;
				max=a;
				while(a>0)
				{
					sum=sum+a;
					count++;
					max = a > max? a : max;
					min = a < min? a : min;
					System.out.println("Enter Next number : ");
					a=sc.nextInt();
				}
				int avg=sum/count;
				System.out.println("Number of positive number entered :"+count);
				System.out.println("the minimum number : "+min);
				System.out.println("the maximum number : "+max);
				System.out.println("the average of numbers : "+avg);
				return 0;
	}
}

public class positive_integer
{
	//Assignment 18 jan 2023 (Question 6)
	public static void main(String[] args)
	{
		one ob1=new one();
		ob1.logic();
	}
}

