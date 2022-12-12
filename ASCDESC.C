#include<stdio.h>
#include<conio.h>
void main()
{
int i,j;
clrscr();
printf("enter the two number :");
scanf("%d%d",&i,&j);
if(i!=j)
{
 if(i>j)
 printf("%d and %d is in ascending order",i,j);
 else
 printf("%d and %d is in descending order",i,j);
}
getch();
}
