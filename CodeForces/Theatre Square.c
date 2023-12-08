#include<stdio.h>
#include<math.h>

int main(void)
{
    double n,m,a;
    scanf("%lf %lf %lf", &n,&m,&a);
    printf("%1.lf\n", ceil(n/a)*ceil(m/a));

    return 0;
}