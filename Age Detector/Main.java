#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b;
  cin>>a>>b;
  b>a?a = a :b += 100;
  cout<<b-a;
}