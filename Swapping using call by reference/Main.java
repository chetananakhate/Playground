#include <iostream>
using namespace std;
void fun(int &a, int &b)
{ 
  int temp = a;
    a=b;
    b=temp;    
}
int main()
{
    int x , y ;
  cin>>x>>y;
  cout<<"Before swapping a= "<<x<<" and b="<<y<<endl;
    fun(x, y);
    cout<<"After swapping a= "<<x<<" and b="<<y;
    return 0;
}