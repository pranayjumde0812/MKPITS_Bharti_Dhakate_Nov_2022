#include<stdio.h>
#include<conio.h>
void main()
{
int i,n;
clrscr();
printf("enter the the number to find the divisor :");
scanf("%d",&n);
printf("the divisor of %d are\n",n);
for(i=1;i<=n;i++)
{
if(n%i==0)
{
printf("%d\t",i);
}
}
getch();
}