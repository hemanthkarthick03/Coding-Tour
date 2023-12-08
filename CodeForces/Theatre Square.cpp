#include <iostream>
#include<algorithm>
#include<cmath>

int main() 
{
    unsigned long long int n,m,a;
    std::cin>>n>>m>>a;
    unsigned long long int value=ceil((double)m/a)*ceil((double)n/a);
    std::cout<<value ;

return 0;
}