#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,N,L;
  cin>>a>>b>>c;
  if(a>b && a>c)
  {
    if(b>c)
      N=b;
    else
      N=c;
  }
  else if(b>a && b>c)
  {
    if(a>c)
      N=a;
    else
      N=c;
  }
  else if(c>a && c>b)
  {
    if(a>b)
      N=a;
    else
      N=b;
  }
  if(a>b&&a>c)
    L =a;
  else if(b>a&&b>c)
    L=b;
  else
    L=c;
  cout<<"The treasure is in box which has number "<<N<<endl;
  
  for(int i =1;i<L;i++)
  {
    if(a%i==0 && b%i==0 && c%i==0)
      N=i;
  }
  cout<<"The code to open the box is "<<N;
  
}