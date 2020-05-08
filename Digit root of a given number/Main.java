#include<iostream>
using namespace std;
int digitalRoot(string num) 
{  
    if (num.compare("0") == 0) 
        return 0; 
    int ans = 0; 
    for (int i=0; i<num.length(); i++) 
        ans = (ans + num[i]-'0') % 9;
    return (ans == 0)? 9 : ans % 9; 
} 
int main() 
{ 
    string num ;
  	cin>>num;
  
    // Calling digitalRoot function 
    cout<< digitalRoot(num) <<endl; 
  
    return 0; 
} 