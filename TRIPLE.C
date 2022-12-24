#include<stdio.h>
#include<conio.h>
void main()
{
int i,n[7],x[8];
clrscr();
printf("enter the elements of array of size 7 :");
for(i=0;i<7;i++)
{
scanf("%d",&n[i]);
}
for(i=0;i<8;i++)
{
if(i==0)
{
x[i]=n[i];
}
x[i+1]=3*n[i];
printf("%d\t",x[i]);
}
getch();
}