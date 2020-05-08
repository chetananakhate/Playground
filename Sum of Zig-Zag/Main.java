#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int a[r][c],sR[r],sC[c];
  
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  
  
  int sum = 0;
  for(int i=0;i<r;i++){
    if(i==0 || i==r-1)
    for(int j=0;j<c;j++){
        sum+=a[i][j];
    }
  }
  
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      if(j==r-i-1 && i!=c-1 && j!=r-1)
      sum+=a[i][j];
  
  cout<<"Sum of Zig-Zag pattern is "<<sum;
  
}