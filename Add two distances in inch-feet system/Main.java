#include<iostream>
#include<stdio.h>

using namespace std;
struct Distance{
int feet;
  float inch;
}
  d1,d2,sumofdistance;
int main()
{
  cin>> d1.feet;
  cin>> d1.inch;
  cin>> d2.feet;
  cin>> d2.inch;
  
  sumofdistance.feet=d1.feet+d2.feet;
  sumofdistance.inch=d1.inch+d2.inch;
  
  if(sumofdistance.inch>12.0)
  {
    sumofdistance.inch=sumofdistance.inch-12.0;
    ++sumofdistance.feet;
  }
  cout<<sumofdistance.feet<< "\'-" <<sumofdistance.inch <<"\"";
  return 0;
}
