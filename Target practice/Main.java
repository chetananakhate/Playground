#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int x=0;
  int sum=0,count=0;
  while(sum < n)
  {
    cin>>x;
    count++;
    sum = sum + x;
  }
  cout<<"The number of turns is "<<count;
    
}