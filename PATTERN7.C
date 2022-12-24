#include<stdio.h>
#include<conio.h>
/*     1
     1 2 3
   1 2 3 4 5
 1 2 3 4 5 6 7 */
void main()
{
int h,space,str;
clrscr();
for(h=1;h<=7;h=h+2)
{
 for(space=1;space<=40-h;space++)
 {
  printf(" ");
 }
 for(str=1;str<=h;str++)
 {
  printf(" %d",str);
 }
 printf("\n");
}
getch();
}