/* WAP to find missing number in nature number array */
/*You are given an array of integers of size (N minus 1) ranging from 1 to N. There are no duplicates in the list. One of the integers is
missing in the array. The task is to find the missing number in the series */
import java.util.Scanner;
class find_missing
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of nature number array :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the nature numbers in array range from 1 to N");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n=arr.length;
		System.out.println("Length :"+n);
		int m=n+1;
		int total=m*(m+1)/2;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		int missing_number=total-sum;
		System.out.println("Missing number in array is "+missing_number);
	}
}