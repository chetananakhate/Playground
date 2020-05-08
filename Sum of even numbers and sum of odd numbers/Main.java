#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  int n,a;
  cin>>n;
  int sumO=0,sumE=0;
  for(int i=0;i<n;i++)
  {
    cin>>a;
    if(a%2==0)
    	sumE+=a;
    else sumO+=a;
  }
  cout<<"The sum of the even numbers in the array is "<<sumE<<endl;
  cout<<"The sum of the odd numbers in the array is "<<sumO;
}