#include<stdio.h>
#include<conio.h>
void main()
{
int i,n[7],x;
clrscr();
printf("enter the elements of array of size 7 :");
scanf("%d",&x);
for(i=0;i<7;i++)
{
n[i]=x;
x=x*3;
}
for(i=0;i<7;i++)
{
printf("%d\t",n[i]);
}
getch();
}