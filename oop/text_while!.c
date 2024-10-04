#include <stdio.h>

int main(){
    int i = 7;
    int j = i -i ;
   while (!i)
   {
    i /= 2;
    j++;
   }
    printf("%d",j);
   
}