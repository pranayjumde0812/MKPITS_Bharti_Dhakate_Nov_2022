#include<stdio.h>
#include<conio.h>
void main()
{
int h,space,str,c=1;
clrscr();
for(h=65;h<=71;h=h+2)
{
 for(space=1;space<=40-c;space++)
 {
  printf(" ");
 }
 for(str=65;str<=h;str=str+2)
 {
  printf(" %c",h);
 }
 c++;
 printf("\n");
}
getch();
}