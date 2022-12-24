#include<stdio.h>
#include<conio.h>
void main()
{
int h,space,str;
clrscr();
for(h=1;h<=7;h++)
{
 if(h%2==0)
 continue;
 for(space=1;space<=40-h;space++)
 {
  printf(" ");
 }
 for(str=1;str<=h;str=str+2)
 {
  printf(" %d  ",h);
 }
 printf("\n");
}
getch();
}