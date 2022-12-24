#include<stdio.h>
#include<conio.h>
void main()
{
int h,space,str,c=1;
clrscr();
for(h=65;h<=68;h++)
{
 for(space=1;space<=40-c;space++)
 {
  printf(" ");
 }
 for(str=65;str<=h;str++)
 {
  printf(" %c",h);
 }
 c++;
 printf("\n");
}
getch();
}