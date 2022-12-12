#include<stdio.h> //swapping of numbers without using temporary variable
#include<conio.h>
void main()
{
int i,j;
clrscr();
printf("enter two number :");
scanf("%d%d",&i,&j);
printf("i = %d\n j = %d",i,j);
i=i+j;
j=i-j;
i=i-j;
printf("\ni = %d\n j = %d",i,j);
getch();
}