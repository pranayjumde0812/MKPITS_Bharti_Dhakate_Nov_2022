#include<stdio.h>
#include<conio.h>
void main()
{
float i,s=0;
for(i=1;i<=50;i++)
{
s=s+(1/i);
}
clrscr();
printf("%f",s);
getch();
}