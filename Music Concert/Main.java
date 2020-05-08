#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,x,M=0,F=0;
  cin>>n;
  
  for (int i=0;i<n;i++)
  {
    cin>>x;
    if(x%2==0)
      F++;
    else
      M++;
  }
  cout<<M<<endl;
  cout<<F;
  return 0;
}