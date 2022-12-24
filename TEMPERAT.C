#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c,tem;
clrscr();
printf("press 0 if its raining and press 1 if its snowing :");
scanf("%d",&a);
switch(a)
{
 case 0:
 printf("\nenter the temperature ");
 scanf("%d",&tem);
 if(tem>45)
 b=1;
 switch(b)
 {
  case 1:
  printf("\nwear light weight rain coat");
  break;
  default:
  printf("\nwear fleece and rain coat");
 }
 break;
 case 1:
 printf("\nenter the temperature :");
 scanf("%d",&tem);
 if(tem>20)
 c=1;
 else if(tem<=20 && tem>0)
 c=2;
 switch(c)
 {
  case 1:
  printf("\nwear soft shell jacket");
  break;
  case 2:
  printf("\nwear down jacket");
  break;
  default:
  printf("\nwear base layer and down jacket");
 }
 break;
 default:
 printf("\nit is hard to come up with interesting example");
}
getch();
}