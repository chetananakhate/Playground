#include<iostream>
#include<string.h>
using namespace std;
int main ()
{
    char str1[50], str2[50];
    std::cin>>str1;
    std::cin>>str2;
    if(strcmp(str1, str2)==0)
       std::cout << "It is correct";
    else
        std::cout << "It is wrong";
    return 0;
}