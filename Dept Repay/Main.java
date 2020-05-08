#include<iostream>
using namespace std;
int main()
{
  int X, Y, R;
  cin>>X>>R>>Y;
  int interest = float(X*R*Y/100);
  cout<<interest<<"\n";
  cout<<interest+float(X)<<"\n";
  cout<<interest*0.02<<"\n";
  cout<<(interest+float(X))-(interest*0.02)<<"\n";
  //Type your code here.
}