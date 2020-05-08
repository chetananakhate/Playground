#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char str[100];
  std::cin.getline(str,100);
 // std::cout<<str;
  int i, j; 
  // cout<<"String before modification: "<<str<<endl; 
   for(i = 0; str[i] != '\0'; ++i) {
      while(!( (str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z') || str[i] == '\0')) {
         for(j = i; str[j] != '\0'; ++j) {
            str[j] = str[j+1];
         }
      }
   }
   std::cout<<str;
   return 0;
}