#include<iostream>
using namespace std;
int fact = 1;
void factorial(int a)
  {
    fact *=a;
    if(a!=1)
      factorial(a-1);
  }
int main()
{
  //Type your code here.
  int x;
  cin>>x;
  int temp = x;
  
  factorial(x);
    
    cout<<"The factorial of "<<temp<<" is "<<fact;
}