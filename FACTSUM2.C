#include<stdio.h>
#include<conio.h>
void main()
{
float n=1,i,s=0;
for(i=1;i<=7;i=i+2)
{
s=s+(i/n);
n=n*2;
}
printf("\t%f",s);
getch();
}