#include<iostream>
using namespace std;
int gcd(int n1, int n2)
{
  if(n2!=0)
  return gcd(n2,n1%n2);
    else 
      return n1;
}
int main() 
{ 
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  if(gcd(a,gcd(b,c))==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
} 