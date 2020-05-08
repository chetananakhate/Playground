#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,no;
  cin>>n;
  no=n;
  int sum=0;
  while(n>0)
  {
    sum=sum+(n%10);
    n=(int)n/10;
  }
  if(no%sum!=0)
  {
    cout<<"Not Harshad Number";
  }
  else
  {
    cout<<"Harshad Number";
  }
}