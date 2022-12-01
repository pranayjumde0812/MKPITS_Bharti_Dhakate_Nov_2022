#include<iostream.h>
#include<conio.h>
class one
{
 public:
 int a,b;
};
class two:public one
{
 public:
 int c;
 void set()
 {
  a=2;
  b=3;
  c=4;
 }
 void dis()
 {
  cout<<a<<b<<c;
 }
};
void main()
{
 clrscr();
 two ob;
 ob.set();
 ob.dis();
 getch();
}