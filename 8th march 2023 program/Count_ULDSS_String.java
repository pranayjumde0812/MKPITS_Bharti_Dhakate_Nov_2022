/*WAP in java to find UpperCase, LOwerCase, Digits, Special
Characters, Spaces in a string*/

import java.util.Scanner;
class Count_ULDSS_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		int up=0,lw=0,dg=0,scp=0,sp=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				up++;
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				lw++;
			}
			else if(ch[i]>='0' && ch[i]<='9')
			{
				dg++;
			}
			else if(ch[i]==' ')
			{
				sp++;
			}
			else {
				scp++;
			}
		}
		System.out.println("UpperCase : "+up);
		System.out.println("LowerCase : "+lw);
		System.out.println("Digits : "+dg);
		System.out.println("Special Character : "+scp);
		System.out.println("Spaces : "+sp);
	}
}