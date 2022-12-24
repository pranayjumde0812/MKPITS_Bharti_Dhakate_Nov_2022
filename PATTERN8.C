#include<stdio.h>
#include<conio.h>
/*     1
     3 2 1
   5 4 3 2 1
 7 6 5 4 3 2 1 */
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
 for(str=h;str>=1;str--)
 {
  printf(" %d",str);
 }
 printf("\n");
}
getch();
}