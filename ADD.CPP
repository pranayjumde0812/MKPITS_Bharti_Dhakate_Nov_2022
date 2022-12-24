#include<iostream.h>
#include<conio.h>
void main()
{
clrscr();
long double i,num,sum=0;
cout<<"enter the value";
cin>>num;
for(i=1;i<=num;i++)
{
sum=sum+i;
}
cout<<"sum = "<<sum;
getch();
}