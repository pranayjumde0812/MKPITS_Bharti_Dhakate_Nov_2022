#include<iostream.h>
#include<conio.h>
#include<string.h>
void main()
{
char user[15]={"ram"},pass[15]={"shyam"},userk[15],passk[15];
int c1,c2;
clrscr();
cout<<"enter the user name :";
cin>>userk;
cout<<"enter password :";
cin>>passk;
c1=strcmp(user,userk);
c2=strcmp(pass,passk);
clrscr();
if(c1==0&&c2==0)
cout<<"welcome to abc bank";
else
cout<<"invalid input";
getch();
}