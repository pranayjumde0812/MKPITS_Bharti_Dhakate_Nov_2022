#include<stdio.h>
#include<conio.h>
void main()
{
int n,x,i,j=1;
clrscr();
printf("enter the number of lines :");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
for(x=0;x<3;x++)
{
printf("%d\t",j++);
}
printf("\n");
}
getch();
}