#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int temp = n*n;
  int temp1 = n,count=0;
  while(temp1!=0)
  {
    temp1=temp1/10;
    count++;
  }
  int part = pow(10,count);
 int sum = (temp/part)+(temp%part);
  if(sum==n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
    
  
  
}