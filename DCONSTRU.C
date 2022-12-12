#include<iostream.h>//default constructor
#include<conio.h>
class one
{
public:
int a,b;
one(int x, int y)
{
 a=x;
 b=y;
}
void display()
{
 cout<<a<<b<<endl;
}
};
void main()
{
clrscr();
cout<<"constructor called";
one ob1(2,3); //implicit calling
one ob2=one(4,5); //explicit calling
ob1.display();
ob2.display();
getch();
}