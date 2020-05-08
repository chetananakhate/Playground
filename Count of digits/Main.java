#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int a;
  int count = 0;
  cin>>a;
  while(a>=10){
    
   int r = a%10;
   a /= 10; 
    count++;
  };
  cout<<count+1;
}