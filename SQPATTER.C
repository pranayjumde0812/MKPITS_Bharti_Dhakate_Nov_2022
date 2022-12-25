#include<stdio.h>
#include<conio.h>
void main()
{
int h,sp,str;
clrscr();
for(h=1;h<=8;h++)
{
 for(sp=1;sp<=41-h;sp++)
 {
 printf(" ");
 }
 for(str=1;str<=h;str++)
 {
 if(str%2==0)
 {
 printf(" ?");
 }
 else
 {
 printf(" *");
 }
 }
printf("\n");
}
getch();
}