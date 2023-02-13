/*Write a program to check if an array of integers contains a 3 next to a 3
or a 5 next to a 5 or both. */
import java.util.Scanner;
class assignment_25_16
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Array : ");
		int ln=sc.nextInt();
		int i,flag=0,flag1=0;
		int arr[]=new int[ln];
		System.out.println("Enter the elements of Array :");
		for(i=0;i<ln;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<ln-1;j++)
		{
			if(arr[j]==5 && arr[j+1]==5)
				flag1=1;
			if(arr[j]==3 && arr[j+1]==3)
				flag=1;
		}
		if(flag1==1 && flag==1)
		{
			System.out.println("an array of integers contains both 3 next to a 3 and a 5 next to a 5");
		}
		else if((flag1==1 && flag!=1) || (flag1!=1 && flag==1))
		{
			System.out.println("an array of integers contains a 3 next to a 3 or a 5 next to a 5");
		}
		else
		System.out.println("an array of integers does not contains a 3 next to a 3 or a 5 next to a 5 or both");
	}
}