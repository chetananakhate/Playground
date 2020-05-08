#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,days=0;
  cin>>n;
  float n1=0;
  for(int i=0;i<n;i++)
  {
    days++;    
    n1=n1+((1/sqrt(n)));
  }
  for(int i=0;i<(int)n1;i++)
    days++;
  cout<<days+1;
    
}