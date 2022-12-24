#include<stdio.h>
#include<conio.h>
void main()
{
int i,n[7];
clrscr();
printf("enter the elements of array of size 7 :");
for(i=0;i<7;i++)
{
scanf("%d",&n[i]);
}
for(i=0;i<7;i++)
{
if(n[i]<=0)
{
n[i]=100;
}
printf("%d\t",n[i]);
}
getch();
}