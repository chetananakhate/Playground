#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int a[n];
  for (int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int x;
  cin>>x;
  for(int i=0;i<n;i++)
    if(x==a[i])
    {
      cout<<"She passed her exam";
      return 0;
    }
  
  cout<<"She failed";
}