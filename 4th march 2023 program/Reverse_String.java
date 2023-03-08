/*WAP in java to display the reverse of String*/
import java.util.Scanner;
class Reverse_String
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		String rev="";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev +=ch[i];
		}
		System.out.println("Reverse string is : "+rev);
	}
}