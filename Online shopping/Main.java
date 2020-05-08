#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b, c, d, e, f, g, h, i;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  int j=a*(100-b)/100+c;
  int k=d*(100-e)/100+f;
  int l=g*(100-h)/100+i;
  cout<<"In Flipkart Rs."<<j;
  cout<<"\nIn Snapdeal Rs."<<k;
  cout<<"\nIn Amazon Rs."<<l;
  
  if (j<=k && j<l)
    cout<<"\nHe will prefer Flipkart";
  else
  	j>k && k<=l?cout<<"\nHe will prefer Snapdeal":cout<<"\nHe will prefer Amazon";
}