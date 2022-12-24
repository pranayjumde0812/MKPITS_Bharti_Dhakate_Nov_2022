#include<iostream.h>
#include<conio.h>
void main()
{
long int n1,n,num,count=0,rev=0,i;
clrscr();
cout<<"enter the n-digit number :";
cin>>num;
while(num>0)
{
n1=num%10;
rev=(rev*10)+n1;
num=num/10;
count=count+1;
}
for(i=1;i<=count;i++)
{
while(rev>0)
{
n=rev%10;
rev=rev/10;
switch(n)
{
 case 1:
 cout<<"\tone";
 break;
 case 2:
 cout<<"\ttwo";
 break;
 case 3:
 cout<<"\tthree";
 break;
 case 4:
 cout<<"\tfour";
 break;
 case 5:
 cout<<"\tfive";
 break;
 case 6:
 cout<<"\tsix";
 break;
 case 7:
 cout<<"\tseven";
 break;
 case 8:
 cout<<"\teight";
 break;
 case 9:
 cout<<"\tnine";
 break;
 case 0:
 cout<<"\tzero";
 break;
}
if(count==6&&count==7||count==6)
cout<<"\tlakh";
if(count==4&&count==5||count==4)
cout<<"\tthousand";
if(count==3)
cout<<"\thundread";
count--;
}
}
getch();
}

