#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  int d3,c3;
  if(c1+c2>=100)
  {
    c3 = c1+c2-100;
    d3 = d1+d2+((c1+c2)/100) ;
  }
  else
  {
    c3=c1+c2;
    d3=d1+d2;
  }
  cout<<d3<<endl;
  cout<<c3;
}