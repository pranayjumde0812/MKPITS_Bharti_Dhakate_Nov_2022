#include<iostream.h>
#include<conio.h>
class time
{
public:
int hr,min,sec;
void setdata()
{
cout<<"\n enter hour :";
cin>>hr;
cout<<"enter min :";;
cin>>min;
cout<<"enter sec :";
cin>>sec;
cout<<"\n time =>"<<hr<<":"<<min<<":"<<sec<<endl;
}
void add(time ob1,time ob2)
{
sec=ob1.sec+ob2.sec;
min=ob1.min+ob2.min+(sec/60);
hr=ob1.hr+ob2.hr+(min/60);
sec=sec%60;
min=min%60;
}
void display()
{
cout<<"\n addition of time is :"<<hr<<":"<<min<<":"<<sec;
}
};
void main()
{
clrscr();
time ob1,ob2,ob3;
ob1.setdata();
ob2.setdata();
ob3.add(ob1,ob2);
ob3.display();
getch();
}
