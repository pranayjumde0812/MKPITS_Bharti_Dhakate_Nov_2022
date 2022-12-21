#include<iostream.h>
#include<conio.h>
#include<string.h>
#include<stdio.h>
#include<stdlib.h>
int i=0;    //global variable
void creatacc(); //predefine prototype
void with();
void balance();
void dep();
void disall();
void dissingle();
struct bank
{
int accno;
float bal;
char tyac[20], name[20];
}s[100];
void mainscreen()
{
int choice;
while(1)  //infinite loop start
{
cout<<"\npress 1 for acc creation"<<endl;
cout<<"press 2 for withdrawal"<<endl;
cout<<"press 3 for deposite:"<<endl;
cout<<"press 4 for balance:"<<endl;
cout<<"press 5 to display all record :"<<endl;
cout<<"press 6 to display single record :"<<endl;
cout<<"press 7 for exit"<<endl;
cout<<"enter the choice :";
cin>>choice;
if(choice==1)
creatacc();
if(choice==2)
with();
if(choice==3)
dep();
if(choice==4)
balance();
if(choice==5)
disall();
if(choice==6)
dissingle();
if(choice==7)
exit(0);
}//infinite loop closed
}
void creatacc()
{
cout<<"\nadd account number :";
cin>>s[i].accno;
cout<<"person name :";
cin>>s[i].name;
cout<<"type of account :";
cin>>s[i].tyac;
cout<<"initial balance :";
cin>>s[i].bal;
i++;
}
void with()
{
int j,id,rupees;
cout<<"\nenter the account to withdraw money :";
cin>>id;
cout<<"enter the withdrawal money: ";
cin>>rupees;
for(j=0;j<=i;j++)
{
if(s[j].accno==id)
{
s[j].bal=s[j].bal-rupees;
cout<<"available balance :"<<s[j].bal<<endl;
}
}
}
void dep()
{
int j,id,rupees;
cout<<"\nenter the id to deposite money :";
cin>>id;
cout<<"enter the deposite money: ";
cin>>rupees;
for(j=0;j<=i;j++)
{
if(s[j].accno==id)
{
s[j].bal=s[j].bal+rupees;
cout<<"available balance :"<<s[j].bal<<endl;
}
}
}
void balance()
{
int j,id;
cout<<"\nenter the id to check balance :";
cin>>id;
cout<<"no. of account :"<<i<<endl;
for(j=0;j<=i;j++)
{
if(s[j].accno==id)
{
cout<<"balance :"<<s[j].bal<<endl;
}
}
}
void disall()
{
int j;
cout<<"\ndisplay of all record :"<<endl;
cout<<"srno"<<"\tacno"<<"\tname"<<"\ttyacc"<<"\tbalance"<<endl;
for(j=0;j<i;j++)
{
cout<<j+1<<"\t"<<s[j].accno<<"\t"<<s[j].name<<"\t"<<s[j].tyac<<"\t"<<s[j].bal<<endl;
}
}
void dissingle()
{
int j,id;
cout<<"\nenter the id to display the record :";
cin>>id;
cout<<"srno"<<"\tacno"<<"\tname"<<"\ttyacc"<<"\tbalance"<<endl;
for(j=0;j<i;j++)
{
if(s[j].accno==id)
{
cout<<j+1<<"\t"<<s[j].accno<<"\t"<<s[j].name<<"\t"<<s[j].tyac<<"\t"<<s[j].bal<<endl;
}
}
}
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
ch=getch();//getch is used to seperate the letter within word
passk[i]=ch;
cout<<"*";
i++;
}
while(ch!='\r'); //\r is used for enter
passk[i-1]='\0';//i-1 is used because we want null value exactly after password
getch();
c1=strcmp(user,userk);
c2=strcmp(pass,passk);
clrscr();
cout<<c1<<c2;
if(c1==0&&c2==0)
{
cout<<"welcome to abc bank";
mainscreen();
}
else
cout<<"invalid input";
getch();
}