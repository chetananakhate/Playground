#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b, c;
  cin>>a>>b>>c;
  
  if (c<=a || c>(b-1)*a || (c-1)%a==0)
    cout<<"Yes";
  else
    cout<<"No";
  
}