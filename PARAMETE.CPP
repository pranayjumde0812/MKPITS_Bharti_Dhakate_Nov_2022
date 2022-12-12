#include<iostream.h> //it is a constructor which access more than one
#include<conio.h>    //argument.
class one
{
public:
int a,b;
one(int x, int y)
{
cout<<"constructor called"<<endl;
a=x;
b=y;
}
void display()
{
cout<<"a :"<<a<<"b :"<<b<<endl;
}
};
void main()
{
clrscr();
one ob1(4,5); //implicit calling
one ob2=one(2,3); //explicit calling
ob1.display();
ob2.display();
getch();
}
