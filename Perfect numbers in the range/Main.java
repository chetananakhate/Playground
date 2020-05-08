#include<iostream>
using namespace std;

int main(){
    int a,b;
  cin>>a>>b;
for (a ; a<b ; a++)
{	int n,i=1,sum=0;
  		n=a;
       while(i<n){
       if(n%i==0)
       sum=sum+i;
       i++; 
				}
 
	if(sum==n)
    cout << i<<" "; 
}
return 0;
}