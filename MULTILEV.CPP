#include<iostream.h>
#include<conio.h>
class one
{
public:
int a;
void set1()
{
a=2;
}
void dis1()
{
cout<<a;
}
};
class two:public one
{
public:
int b;
void set2()
{
b=4;
}
void dis2()
{
cout<<b;
}
};
class three:public two
{
public:
int c;
void set3()
{
c=5;
}
void dis3()
{
cout<<c;
}
};
void main()
{
clrscr();
three ob;
ob.set1();
ob.set2();
ob.set3();
ob.dis1();
ob.dis2();
ob.dis3();
getch();
}
