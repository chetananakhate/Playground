#include<iostream>
using namespace std;
int power(int a,int b,int n)
{
  if(n>0)
  {
    a = a*b;
  	power(a,b,n-1);}
  else
    return a;
};
int main()
{
  //Type your code here.
  int a,n;
  cout<<"Enter the value of a"<<endl;
  cin>>a;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,a,n-1);
}