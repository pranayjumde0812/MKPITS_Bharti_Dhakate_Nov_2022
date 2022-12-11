#include<iostream.h>
#include<conio.h>
class one
{
public:
 int a,b;
 void setdata(int x, int y)
 {
  a=x;
  b=y;
 }
 void add(one ob1,one ob2)
 {
  a=ob1.a+ob2.a;
  b=ob1.b+ob2.b;
 }
 void display()
 {
  cout<<a<<b;
 }
};
void main()
{
 one ob1,ob2,ob3;
 ob1.setdata(2,3);
 ob2.setdata(4,5);
 ob3.add(ob1,ob2);
 ob3.display();
 getch();
}