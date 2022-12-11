#include<iostream.h>
#include<conio.h>
class customer
{
public:
int j,i,id,pn[10];
char name[30];
void customer::setdata(void)
{
cout<<"enter customer record :";
for(i=0;i<5;i++)
{
cout<<"\n id : ";
cin>>id;
cout<<"\n name :";
cin>>name;
cout<<"\n phone number : ";
cin>>pn[i];
}
}
void customer::logic()
{
for(i=0;id<5;i++)
{
for(i=0;pn[i]<10;i++)
{
if(pn[8]==8&&pn[9]==8)
{
cout<<"id :"<<id<<endl<<"name :"<<name<<endl<<"phone number :"<<pn<<endl;
}
}
}
}
};
void main()
{
clrscr();
customer ob;
ob.setdata();
ob.logic();
getch();
}