#include<iostream>
using namespace std;

struct employee{
  char name[10];
  int id;
  int age;
  char post[10];
  float salary;
};
int main()
{
  struct employee e;
  cout<<"Enter name:";
cout<<"\nEnter ID:";
  cout<<"\nEnter age:";
  cout<<"\nEnter designation:";
  cout<<"\nEnter Salary:";
  cin>>e.name;
  cin>>e.id;
  cin>>e.age;
  cin>>e.post;
  cin>>e.salary;
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<e.name;
  cout<<"\nID of the Employee : "<<e.id;
  cout<<"\nAge of the Employee : "<<e.age;
  cout<<"\nDesignation of the Employee : "<<e.post;
   cout<<"\nSalary of the Employee : "<<e.salary;
}