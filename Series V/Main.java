#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x=11;
  int n;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cout<<x*x<<" ";
    x+=4;
  }
}