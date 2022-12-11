#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,k;
clrscr();
for(i=0;i<3;i++)
{
 for(j=65;j<=67-i;j++)
 {
   printf("%c",j);
 }
 for(j=1;j<=i*2;j++)
 {
 printf(" ");
 }
 for(k=67-i;k>=65;k--)
 {
 printf("%c",k);
 }
 printf("\n");
}
getch();
}