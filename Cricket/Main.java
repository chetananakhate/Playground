#include<iostream>
using namespace std;
int main()
  {
  //Type your code here.
  int tb,tr,rs,bb;
  cin>>tb>>tr>>rs>>bb;
  int over = tb/6;
    int i,j;
  i=bb/6;
  j=bb%6;
  float f_over = i + (j/10.0);
  float current_rr =(rs/f_over);
  float total_rr = (float)tr/over;
  cout<<over<<endl;
  cout<<f_over<<endl;
  printf("%.1f\n",current_rr);
  printf("%.1f\n",total_rr);
  if(total_rr<=current_rr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
    
 
  
}
