#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a[n];
  a[0]=0;
  a[1]=1;
  for(int i=2;i<=n;i++)
  {
    a[i]=a[i-1]+a[i-2];
  }
  cout<<a[n-1];
}