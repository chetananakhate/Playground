#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string a;
  int b;
  cin>>a>>b;
  
  if (a == "front" && b==1 || a != "front" && b!=1)
    cout<<"Left Handed";

  else
    cout<<"Right Handed";
}