#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d",&a);
  b=a/10;
  c=a%10;
  a=b+c;
  printf("%d",a);
  return 0;
}