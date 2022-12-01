 #include<iostream.h>//addition of two object using return funct and temporary object//
 #include<conio.h> //object as a return type//
 class one
 {
 public:
 int a,b;
 void setdata(int x,int y)
 {
  a=x;
  b=y;
 }
 one add(one ob2)
 {
 one tob;
 tob.a=a+ob2.a;
 tob.b=b+ob2.b;
 return(tob);
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
 ob3=ob1.add(ob2);
 ob3.display();
 getch();
 }

