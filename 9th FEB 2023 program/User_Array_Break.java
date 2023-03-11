/*WAP in java for 'break' statement where we have pre-defined array of length 10,
but user only want to put 5 elements in array - Cognizant Interview question*/
import java.util.Scanner;
class User_Array_Break {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter the number of elements user wants to store in array of length 10 : ");
		int n=sc.nextInt();
		System.out.println("Enter the element of array : ");
		for(int i=0;i<10;i++)
		{
			if(i==n) {
				break;
			}
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+"  ");
		}
	}
}

