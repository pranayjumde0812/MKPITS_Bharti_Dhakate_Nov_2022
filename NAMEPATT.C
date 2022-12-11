#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
char d[50];
int i,j,l;
clrscr();
printf("enter the name :");
gets(d);
l=strlen(d);
for(i=0;i<l;i++)
{
 for(j=0;j<=i;j++)
 {
 printf("%c",d[j]);
 }
 printf("\n");
}
getch();
}
