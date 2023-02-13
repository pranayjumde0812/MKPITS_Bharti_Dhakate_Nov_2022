/*Write a program to create a new array of length 3 from a given
array (length atleast 3) containing the elements from the middle
of the array  */
import java.util.Scanner;
class assignment_25_5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr2=new int[3];
		System.out.println("Enter the length for array");
		int ln=sc.nextInt();
		int[] arr1=new int[ln];
		if(ln>2)
		{
			System.out.println("Enter the elements of array");
			for(int i=0;i<ln;i++)
			{
				arr1[i]=sc.nextInt();
			}
			int n1=ln/2;
			int n2=(ln/2)-1;
			int n3=(ln/2)+1;
			arr2[0]=arr1[n2];
			arr2[1]=arr1[n1];
			arr2[2]=arr1[n3];
			System.out.println("Array containing three middle elements : ["+arr2[0]+" "+arr2[1]+" "+arr2[2]+"]");
		}
	}
}