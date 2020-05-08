#include<iostream>
using namespace std;
int arrayType(int n,int a[])
{
  int countE=0,countO=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      countE++;
    else
      countO++;
  }
  if(countE==n)
    return 1;
  else if(countO==n)
    return 2;
  else
    return 3;
}
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  	cin>>a[i];
  switch(arrayType(n, a))
  {
    case 1:cout<<"The array is Even";
      break;
    case 2:cout<<"The array is Odd";
      break;
    case 3:cout<<"The array is Mixed";
      break;
  };
}