#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int count=1;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<=i;j++)
    {
      if(i==j)
        cout<<count;
      else
        cout<<count<<"*";
    }
    cout<<"\n";
    count++;
  }
  count--;
  for(int i=n;i>0;i--)
  {
    for(int j=1;j<=i;j++)
    {
      if(i==j)
        cout<<count;
      else
        cout<<count<<"*";
    }
    cout<<"\n";
    count--;
  }
}