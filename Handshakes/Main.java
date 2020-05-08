#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  cin>>a;
  int count =0;
  for(int i=0; i<a-1;i++)
  {
    for(int j=i;j<a-1;j++)
      count++;
  }
  cout<<count++;
}