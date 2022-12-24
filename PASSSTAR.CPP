#include<iostream.h>
#include<conio.h>
#include<string.h>
#include<stdio.h>
void main()
{
char ch,user[15]={"ram"},pass[15]={"shyam"},userk[15],passk[15];
int c1,c2,i=0;
clrscr();
cout<<"enter the user name :";
cin>>userk;
cout<<"enter password :";
do
{
ch=getch();
passk[i]=ch;
cout<<"*";
i++;
cout<<i;
}
while(ch!='\r');//\r is used for enter
passk[i-1]='\0';//i-1 is used because we want null value exactly after password
getch();
c1=strcmp(user,userk);
c2=strcmp(pass,passk);
clrscr();
cout<<c1<<c2;
if(c1==0&&c2==0)
cout<<"welcome to abc bank";
else
cout<<"invalid input";
getch();
}