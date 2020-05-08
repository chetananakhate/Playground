#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b, c;
  cin>>a>>b>>c;
  
  int d, e, f, g;
  
  d = a+1;
  e = a+b;
  f = a*(b-2) +1;
  g = a*(b-2) +a;
  
  if (c>=d && c<=e)
    cout<<"It is a mango tree";
  else if (c>=f && c<=g)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  
}