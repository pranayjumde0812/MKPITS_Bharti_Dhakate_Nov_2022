import java.util.Scanner;
class Diff_max_min_number
{
	//Assignment 18 jan 2023 (Question 4)
	public static void main(String[] args)
	{
		double max, min;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 4 real numbers :");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double c=sc.nextDouble();
			double d=sc.nextDouble();

			//For maximum number
			if(a>b && a>c && a>d)
				max=a;
				else if(b>a && b>c && b>d)
					max=b;
				else if(c>a && c>b && c>d)
					max=c;
				else
				max=d;

			//For minimum number
			if(a<b && a<c && a<d)
					min=a;
				else if(b<a && b<c && b<d)
					min=b;
				else if(c<a && c<b && c<d)
					min=c;
				else
				min=d;

			//Differece
			double diff = max-min;
		System.out.println("Difference between max and min number : "+diff);
	}
}

