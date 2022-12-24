#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,a[2][2]={{1,2},{3,4}},b[2][2]={{1,2},{3,4}},flag=1;
clrscr();
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
if(a[i][j]!=b[i][j])
{
flag = 0;
break;
}
}
}
if(flag==1)
printf("equal");
else
printf("not equal");
getch();
}