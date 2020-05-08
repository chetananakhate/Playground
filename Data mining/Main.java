#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sumE=0,sumO=0,temp;
  cin>>n;
  while(n!=0)
  {
    temp = n%10;
    if(temp%2==0)
      sumE+=temp;
    else
      sumO+=temp;
    n=n/10;
  }
  if (sumE==sumO)
    cout<<"Yes";
  else
    cout<<"No";
}