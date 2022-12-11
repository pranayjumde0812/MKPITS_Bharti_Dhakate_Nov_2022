#include<iostream.h>
#include<conio.h>
class one
{
public:
int a;
};
class two: public one
{
public:
int b;
void set1()
{
b=3;
a=4 ;
}
void dis1()
{
cout<<a<<endl<<b<<endl;
}
};
class three:public one
{
public:
int c;
void set2()
{
c=5;
a=7;
}
void dis2()
{
cout<<a<<endl<<c;
}
};
void main()
{
clrscr();
two ob1;
ob1.set1();
ob1.dis1();
three ob2;
ob2.set2();
ob2.dis2();
getch();
}
