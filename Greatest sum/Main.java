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
  
  for(int i=0;i<r;i++)
  {
    int sum=0;
    for(int j=0;j<c;j++)
    {
      sum=sum + a[i][j];
    }
    sR[i]=sum;
  }
  
  for(int i=0;i<c;i++)
  {
    int sum=0;
    for(int j=0;j<r;j++)
    {
      sum+=a[j][i];
    }
   sC[i]=sum;
  }
  
  cout<<"Sum of rows is ";
  int max=sR[0],p=0;
  for(int i=0;i<r;i++){
  	cout<<sR[i]<<" "; 
    if(max<=sR[i]){
      max=sR[i];
      p=i;
    }
  }
  cout<<endl<<"Row "<<p+1<<" has maximum sum";
  
  cout<<endl;
  cout<<"Sum of columns is ";
  max=sC[0];
  p=0;
  for(int i=0;i<c;i++){
  	cout<<sC[i]<<" "; 
    if(max<sC[i]){
      max=sC[i];
    p=i;}
  }
  cout<<endl<<"Column "<<p+1<<" has maximum sum";
  
}