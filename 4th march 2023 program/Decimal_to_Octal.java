/*WAP in java to covert decimal number to Octal equivalent*/
import java.util.Scanner;
class Decimal_to_Octal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number : ");
		int num=sc.nextInt();
		String oct="";   //you have to take a string because you have concat the number
		while(num>0)
		{
			int rem=num%8;
			oct=rem+oct;
			num=num/8;
		}
		System.out.println("Octal Equivalent of decimal number is : "+oct);
	}
}