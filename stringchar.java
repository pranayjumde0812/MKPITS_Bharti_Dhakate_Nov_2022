import java.util.Scanner;
import java.lang.String;
class stringchar
{
	static int checkIndex(String a)
	{
		int y=a.length();
		int x=a.indexOf('*');
		return x;
	}

	static String starvalue(String k,int b)
	{
		int y=k.length();
		int l=b;
		String d=k.substring(0,l);
		String c=k.substring(l+1,y);
		System.out.println("string before * : "+d);
		System.out.println("String after * : "+c);
		String a=d.concat(c);
		System.out.println("String after removing * : "+a);
		int s=Integer.parseInt(a);
		int x=s/3;
		String str=Integer.toString(x);
		return str;
	}




	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number with star in it : ");
		String s=sc.nextLine();
		stringchar ob=new stringchar();
		int b=ob.checkIndex(s);
		System.out.println("Index of * is : "+b);

		int d=s.indexOf('*');

		String c=ob.starvalue(s,d);
		int a=c.length();

		System.out.println("After divided by 3 : "+c);

		char ch=c.charAt();  //you have to find this
		System.out.println("Number replacing * is : "+ch);
	}
}
