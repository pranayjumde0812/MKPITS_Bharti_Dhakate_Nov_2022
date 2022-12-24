#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,x[2][3]={{1,2},{3,4,5}};
clrscr();
for(i=0;i<2;i++)
{
for(j=0;j<=2;j++)
{
printf("%d\t",x[i][j]);
}
printf("\n");
}
getch();
}