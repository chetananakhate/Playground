#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n=0;
  int count=0;
  float score =0;
  while(n>=0 && count!=3)
  {
    cin>>n;
    if(n>=0){
    if(n%2!=0)
    {
      score ++;
      count++;
    }
    else
    {
      	score = score-0.5;
    }}
  }
  
  if(n<0)
  score= score-1.0;
  
  cout<<score;
}