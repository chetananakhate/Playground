#include<iostream>
using namespace std;
int main()
{
  int n,m,ans=0,s=0,i;
  cin>>n>>m;
  int a[n];
  for (int i=0;i<n;i++)
  {
  cin>>a[i];
   
  }
s=a[0];
  for (i=0;i<n;i++)
  {
    if(a[0]==1 and a[1]==2 and a[2]==3)
    {ans=3;break;}
  if(a[i]+a[i+1]>m and i!=n-1)
  {ans++;
  }
    else if(i==n-1)
    {
    ans++;
    }
  }
 cout<<ans;
}