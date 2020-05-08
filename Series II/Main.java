#include <iostream>
using namespace std;
int main()
{
  int n,x=11;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cout<<x*x<<" ";
    x+=4;
  }
  return 0; 
}