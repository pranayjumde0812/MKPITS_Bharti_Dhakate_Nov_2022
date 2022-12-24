#include<stdio.h>
#include<conio.h>
/*     A
     C B A
   E D C B A
 G F E D C B A */
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
 for(str=h;str>=65;str--)
 {
  printf(" %c",str);
 }
 printf("\n");
 n++;
}
getch();
}