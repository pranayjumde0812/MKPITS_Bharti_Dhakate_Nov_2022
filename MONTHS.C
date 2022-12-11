#include<stdio.h>
#include<conio.h>
void main()
{
int n;
clrscr();
printf("enter the no. of month you want to display :");
scanf("%d",&n);
switch(n)
{
case 1:
printf("%d is january",n);
break;
case 2:
printf("%d is february",n);
break;
case 3:
printf("%d is march",n);
break;
case 4:
printf("%d is april",n);
break;
case 5:
printf("%d is may",n);
break;
case 6:
printf("%d is june",n);
break;
case 7:
printf("%d is july",n);
break;
case 8:
printf("%d is august",n);
break;
case 9:
printf("%d is september",n);
break;
case 10:
printf("%d is october",n);
break;
case 11:
printf("%d is november",n);
break;
case 12:
printf("%d is december",n);
break;
default:
printf("invalid input");
break;
}
getch();
}
