#include<stdio.h>
#include<conio.h>
void main()
{
int r,c;
for(r=1;r<=4;r++)
{
for(c=1;c<=5;c++)
{
if(c==3)
break;
printf("%d",c);
}
printf("\n");
}
getch();
}