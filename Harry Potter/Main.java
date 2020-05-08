#include<iostream>
#include<string>
using namespace std;
int main()
{
  string n;
   cin>>n;
   int a = n.length();
  
  char first = (int)n[0];
  char last = (int)n[a-1];
  int f = first=='1'? 1 : 0;
  int l = last=='1'? 1 : 0;
  cout<<f+l;
}