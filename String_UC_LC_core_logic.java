/*Convert half string in upperCase and other half into lower case using core logic */
import java.util.Scanner;
interface logic
{
	public void alogic(String a);
	void dis();
}
class one implements logic
{
	String s1="";
	String s2="";
	public void alogic(String a)
	{
		char ch[]=a.toCharArray();
		for(int i=0;i<(ch.length/2);i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
			{
				s1=s1+(char)(ch[i]-32);
			}
			else
				s1=s1+ch[i];

		}

		for(int i=(ch.length/2);i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				s2=s2+(char)(ch[i]+32);
			}
			else
				s2=s2+ch[i];
		}
	}

	public void dis()
	{
		System.out.println("String in UpperCase and LowerCase : "+(s1+s2));
	}
}


class String_UC_LC_core_logic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s=sc.next();
		one ob=new one();
		ob.alogic(s);
		ob.dis();
	}
}
