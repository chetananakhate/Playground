#include<iostream>
using namespace std;
int exp(int a,int b,int n)
{
  if(n>0){
    a = a *b;
    exp(a,b,n-1);
  }
  else 
    return a;
  
}
int main() 
{ 
   int a,n,x;
  cin>>a>>n>>x;
  if(exp(a,a,n-1) >= x)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
} 