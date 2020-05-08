#include<iostream>
#include<string>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  std::string str;
  std::getline(std::cin,str);
  std::string rstr;
  std::getline(std::cin,rstr);
  int n=str.length();
   for(int i=0;i<n/2;i++)
   {
    swap(str[i],str[n-i-1]); 
   }
   if(str==rstr)
     std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
}