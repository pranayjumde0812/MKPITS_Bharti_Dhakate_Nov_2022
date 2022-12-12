#include<iostream.h>   //we dont use copy constructor in java because there
#include<conio.h>        //is no need for it. we have (=) operator
class one
{
public:
int a,b;
one(int x, int y)
{
a=x;
b=y;
}
one(one &ob1)
{
 a=ob1.a;
 b=ob1.b;
}
void dis()
{
cout<<a<<b<<endl;
}
};
void main()
{
clrscr();
one ob1(2,3);
one ob2(ob1);
ob2.dis();
getch();
}