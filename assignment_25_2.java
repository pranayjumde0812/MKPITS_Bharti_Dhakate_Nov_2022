/*Write a program to create an array taking two middle elements
from a given array of integers of length even.  */
import java.util.Scanner;
class assignment_25_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr2=new int[2];
		System.out.println("Enter the even length for array");
		int ln=sc.nextInt();
		int[] arr1=new int[ln];
		if(ln%2==0)
		{
			System.out.println("Enter the elements of array");
			for(int i=0;i<ln;i++)
			{
				arr1[i]=sc.nextInt();
			}
			int n1=ln/2;
			int n2=(ln/2)-1;
			arr2[0]=arr1[n2];
			arr2[1]=arr1[n1];
			System.out.println("Array containing two middle elements : ["+arr2[0]+" "+arr2[1]+"]");
		}
		else
		{
			System.out.println("Length of array is not even");
		}
	}
}


