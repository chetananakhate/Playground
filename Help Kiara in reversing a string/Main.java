#include <iostream>
#include <bits/stdc++.h> 

#include <string>
using namespace std;

int main()
{
  
//Your code goes here 
  
  std::string str;
  std::getline(std::cin,str);
  int n=str.length();
  for(int i=0;i<n/2;i++)
  {
   swap(str[i],str[n-i-1]); 
  }
  std::cout<<str;
  
  
  
}