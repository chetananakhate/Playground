#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b;
  
  
  cin>>a;
  cin>>b;
  if (b==13){
    a>13?cout<<"$5.00":cout<<"$2.00";
  }
  else
    a>13?cout<<"$8.00":cout<<"$4.00";
  
}