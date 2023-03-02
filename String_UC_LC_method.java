/*Convert half string in upperCase and other half into lower case */
import java.util.Scanner;

class String_UC_LC_method
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s=sc.next();
		int len=s.length();

		/////*FIRST METHOD USING STRING METHODS*//////////////
		String s1=s.substring(0,(len/2));
		String s2=s.substring((len/2),len);
		System.out.println(s1+"   "+s2);
		System.out.println("Change String : "+(s1.toUpperCase()+s2.toLowerCase()));

	}
}
