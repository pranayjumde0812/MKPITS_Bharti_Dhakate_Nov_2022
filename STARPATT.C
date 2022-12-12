#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,k=1;
clrscr();
for(i=1;i<=5;i++)
{
for(j=5;j>=1;j--)
{
if(k>=j)
printf("*");
else
printf(" ");
}
k++;
printf("\n");
}
getch();
}