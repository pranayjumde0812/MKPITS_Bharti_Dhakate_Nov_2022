#include<iostream.h>
#include<conio.h>
class two
{
public:
int b;
void set()
{
b=3;
}
void dis()
{
cout<<b;
}
};
class three
{
public:
int c;
void set1()
{
c=5;
}
void dis1()
{
cout<<c;
}
};
class one:public two,public three
{
public:
int a;
void set2()
{
a=8;
}
void dis2()
{
cout<<a;
}
};
void main()
{
clrscr();
one ob;
ob.set();
ob.set1();
ob.set2();
ob.dis();
ob.dis1();
ob.dis2();
getch();
}
