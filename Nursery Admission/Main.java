#include<iostream>
using namespace std;
int main() {
   char str[50];  
   int count = 0; 
  std::cin>>str;
   while (str[count] != '\0') 
      count++;
  
   cout <<"The number of letters in the name is "<<count<<endl; 
   return 0;
}