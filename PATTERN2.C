#include<stdio.h>
#include<conio.h>
/*   1
    2 2
   3 3 3
  4 4 4 4 */
void main()
{
int h,space,str;
clrscr();
for(h=1;h<=4;h++)
{
 for(space=1;space<=40-h;space++)
 {
  printf(" ");
 }
 for(str=1;str<=h;str++)
 {
  printf(" %d",h);
 }
 printf("\n");
}
getch();
}