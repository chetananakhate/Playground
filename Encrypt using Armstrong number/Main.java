#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int x=n;
  int y=n;
  int sum =0,count=0;
  while(y!=0)
  {
    y=y/10;
    count++;
  }
  while(x!=0)
  {
    sum=sum+power(x%10,count);
    x=x/10;
  }
  if(sum==n)
    return 1;
  return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}