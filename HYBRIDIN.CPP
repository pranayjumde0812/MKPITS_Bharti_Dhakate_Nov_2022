#include<iostream.h>
#include<conio.h>
#include<stdio.h>
class student
{
public:
int id;
char name[20],add[30];
void set1()
{
cout<<"enter student id : ";
cin>>id;
cout<<"enter name: ";
gets(name);
cout<<"enter address : ";
gets(add);
}
void dis1()
{
cout<<"id : "<<id<<endl<<"name :"<<name<<endl<<"address :"<<add<<endl;
}
};
class sports
{
public:
int sm;
void set2()
{
cout<<"enter the sports marks :";
cin>>sm;
}
void dis2()
{
cout<<"sport marks :"<<sm<<endl;
}
};
class exam:public student
{
public:
int pm1,pm2;
void set3()
{
cout<<"enter marks of two paper:";
cin>>pm1>>pm2;
}
void dis3()
{
cout<<"paper 1 marks :"<<pm1<<endl<<"paper 2 marks :"<<pm2<<endl;
}
};
class result : public exam,public sports
{
public:
int sum;
void set()
{
sum=pm1+pm2+sm;
}
void dis()
{
cout<<"sum :"<<sum<<endl;
}
};
void main()
{
clrscr();
result ob;
ob.set1();
ob.set2();
ob.set3();
ob.set();
ob.dis1();
ob.dis2();
ob.dis3();
ob.dis();
getch();
}