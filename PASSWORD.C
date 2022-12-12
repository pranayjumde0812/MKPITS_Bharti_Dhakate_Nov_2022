#include<stdio.h>
#include<conio.h>
void main()
{
int a,i;
clrscr();
printf("enter the 4 digit password :");
scanf("%d",&a);
if(a==1234)
printf("correct password");
else
printf("incorrect password");
getch();
}