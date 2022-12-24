#include<stdio.h>
#include<conio.h>
void main()
{
int r=69,c;
clrscr();
for(r=69;r>=65;r--)
{
if(r==67)
continue;
for(c=1;c<=5;c++)
{
printf("%c",r);
}
printf("\n");
}
getch();
}