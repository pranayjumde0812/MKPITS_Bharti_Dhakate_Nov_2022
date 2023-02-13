import java.util.Scanner;
import java.lang.String;
class stringPallidrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		int l=s.length()-1;
		char ch[]=new char[s.length()];
		//TO REVERSE THE STRING
		for(int i=0;i<s.length();i++)
		{
			ch[l]=s.charAt(i);
			l--;
		}

		/*for(char c:ch){
			System.out.println(c);
		} */

		String rev=new String(ch); //to convert char array into string
		int v=rev.compareTo(s);  //to compare two string
		if(v==0)
		{
			System.out.println(rev+" is pallidrom");
		}
		else
		{
			System.out.println(rev+" is not pallidrom");
		}
	}
}






