#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
char ch;
clrscr();
do
{
 printf("\nenter a and b");
 scanf("%d%d",&a,&b);
 c=a+b;
 printf("\nsum = %d",c);
 printf("\npress y to exit");
 ch=getch();
}while(ch!='y');
getch();
}