#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,k;
clrscr();
for(i=0;i<4;i++)
{
 for(j=65;j<=68-i;j++)
 {
   printf("%c",j);
 }
 for(j=1;j<=(i*2)-1;j++)
 {
 printf(" ");
 }
 for(k=68-i;k>=65;k--)
 {
  if(k!=68)
 printf("%c",k);
 }
 printf("\n");
}
getch();
}