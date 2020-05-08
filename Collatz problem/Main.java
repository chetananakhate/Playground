#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int count = 0;
  while(n>1)
  {
    cout<<n<<endl;
    if(n%2 == 0)
      n = n/2;
    else
      n=n*3+1;
    count++;
      
  }
  	cout<<n<<endl;
    cout<<count;
}