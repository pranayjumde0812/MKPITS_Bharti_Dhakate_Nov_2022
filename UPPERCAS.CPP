#include<stdio.h>
#include<iostream.h>
#include<conio.h>
#include<string.h>
class stringdemo
{
public:
char str[500];
int x,i,a,e,o,u;
void set()
{
clrscr();
a=0;
e=0;
i=0;
o=0;
u=0;
cout<<"enter the string with uppercase and lowercase :";
gets(str);
}
//:: is used to perform complex operation in class because class does not allow complex operation
void stringdemo::vowels(void)
{
int l=strlen(str);
for(x=0;x<=l;x++)
{
 if(str[x]=='A')
 {
 a=a+1;
 }
 else if(str[x]=='E')
 {
 e=e+1;
 }
 else if(str[x]=='I')
 {
 i=i+1;
 }
 else if(str[x]=='O')
 {
 o=o+1;
 }
 else if(str[x]=='U')
 {
 u=u+1;
 }
 }
 }//close
 void dis()
 {
 cout<<"A = "<<a<<endl;
 cout<<"E = "<<e<<endl;
 cout<<"I = "<<i<<endl;
 cout<<"O = "<<o<<endl;
 cout<<"U = "<<u<<endl;
 //cout<<l;
 }
 };
 void main()
 {
 stringdemo ob;
 ob.set();
 ob.vowels();
 ob.dis();
 getch();
 }

