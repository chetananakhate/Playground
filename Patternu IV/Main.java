#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int count = 1;
  int n;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(j<n-1)
        a[i][j]=count;
      else
        a[i][j]=++count;
    }
  }
  for(int i=0;i<n;i++)
  {
    if(i%2==0)
    {
      //as it is
      for(int j=0;j<n;j++)
        cout<<a[i][j];
    }
    else
    {
      //reverse
      for(int j=n-1;j>=0;j--)
        cout<<a[i][j];
    }
    cout<<endl;
  }
    return 0;
  
}