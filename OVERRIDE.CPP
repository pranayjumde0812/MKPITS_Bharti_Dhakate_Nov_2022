#include<iostream.h>
#include<conio.h>
class one
{
public:
void dis()
{
cout<<"one";
}
};
class two: public one
{
public:
void dis()
{
one::dis();
cout<<"two";
}
};
void main()
{
clrscr();
two ob;
ob.dis();
getch();
}