#include<stdio.h>
#include<conio.h>
/*     A
     A B C
   A B C D E
 A B C D E F G */
void main()
{
int h,space,str,n=1;
clrscr();
for(h=65;h<='G';h=h+2)
{
 for(space=1;space<=40-n;space++)
 {
  printf(" ");
 }
 for(str=65;str<=h;str++)
 {
  printf(" %c",str);
 }
 printf("\n");
 n++;
}
getch();
}