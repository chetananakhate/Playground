#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n+1];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element"<<endl;
  int loc,val,j;
  cin>>loc;
  if(loc>n-1)
  {
    cout<<"Invalid Input";
    return 0;
  }
  cout<<"Enter the value to insert"<<endl;
  cin>>val;
  for(j=n+1;j>=loc;j--)
  {
    a[j]=a[j-1];
  }
  a[j]=val;
  cout<<"Array after insertion is"<<endl;
  for(int i = 0;i<=n;i++)
  {
    cout<<a[i]<<endl;
  }
  
  
}