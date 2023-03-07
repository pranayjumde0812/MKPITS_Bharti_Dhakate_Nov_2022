/*WAP in java to covert decimal number to binary equivalent*/
import java.util.Scanner;
class Decimal_to_Binary
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number : ");
		int num=sc.nextInt();
		String bin="";   //you have to take a string because you have concat the number
		while(num>0)
		{
			int rem=num%2;
			bin=rem+bin;
			num=num/2;
		}
		System.out.println("Binary Equivalent of decimal number is : "+bin);
	}
}