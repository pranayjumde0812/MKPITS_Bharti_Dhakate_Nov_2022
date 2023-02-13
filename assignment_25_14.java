/*Write a program to check if the number of 3's is greater than the number
of 5's.*/
import java.util.Scanner;
class assignment_25_14
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int ln=sc.nextInt();
		int count=0,ctr=0;
		System.out.println("Enter the elements of array ");
		int arr[]=new int[ln];
		for(int i=0;i<ln;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<ln;i++)
		{
			if(arr[i]==3)
			count++;
			if(arr[i]==5)
			ctr++;
		}
		if(count>ctr)
		System.out.println("the number of 3's is greater than the number of 5's");
		else
		System.out.println("the number of 3's is not greater than the number of 5's");
	}
}
